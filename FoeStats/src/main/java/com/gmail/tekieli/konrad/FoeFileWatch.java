package com.gmail.tekieli.konrad;

import static java.nio.file.LinkOption.NOFOLLOW_LINKS;
import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.OVERFLOW;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.Properties;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gmail.tekieli.konrad.model.FoeResponse;
import com.gmail.tekieli.konrad.model.OtherPlayerCity;

import org.json.*;

public class FoeFileWatch {
    private static Scanner scanner;
    private Path path;
    File file;
    JSONArray array;
    private Properties prop;

    public FoeFileWatch(Path folder, Properties prop) {
        this.path = folder;
        this.array = new JSONArray();
        this.prop = prop;
    }

    public void watchDirectoryPath() {

        // Sanity check - Check if path is a folder
        try {
            Boolean isFolder = (Boolean) Files.getAttribute(path, "basic:isDirectory", NOFOLLOW_LINKS);
            if (!isFolder) {
                throw new IllegalArgumentException("Path: " + path + " is not a folder");
            }
        } catch (IOException ioe) {
            // Folder does not exists
            ioe.printStackTrace();
        }

        System.out.println("Watching path: " + path);

        // We obtain the file system of the Path
        FileSystem fs = path.getFileSystem();

        // We create the new WatchService using the new try() block
        try (WatchService service = fs.newWatchService()) {

            // We register the path to the service
            // We watch for creation events
            path.register(service, ENTRY_CREATE);

            // Start the infinite polling loop
            WatchKey key = null;
            while (true) {
                key = service.take();

                // Dequeueing events
                Kind<?> kind = null;
                for (WatchEvent<?> watchEvent : key.pollEvents()) {
                    // Get the type of the event
                    kind = watchEvent.kind();
                    if (OVERFLOW == kind) {
                        continue; //loop
                    } else if (ENTRY_CREATE == kind) {
                        // A new Path was created 
                        Path newPath = ((WatchEvent<Path>) watchEvent).context();
                        // Output
                        System.out.println("New path created: " + newPath);

                        parseJSONArrayFromFile(newPath);

                    }
                }

                if (!key.reset()) {
                    break; //loop
                }
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public void parseJSONArrayFromFile(Path newPath) {
        String fileNmae = this.path.toString() + "/" + newPath.toString();
        Path path2 = Paths.get(fileNmae);
        String entireFileText = "";
        Instant dateInMilis = null;
        BasicFileAttributes attr;
        for (int i = 0; i < 90000000; i++) {
            try {
                attr = Files.readAttributes(path2, BasicFileAttributes.class);
                file = new File(fileNmae);
                scanner = new Scanner(file);
                entireFileText = scanner.useDelimiter("\\A").next();
                scanner.close();
                dateInMilis = attr.creationTime().toInstant();
            } catch (Exception e) {
                //swallow
            }
            if (!entireFileText.isEmpty()){
                this.array = new JSONArray(entireFileText);
                break;
            }
              
        }
        Calendar calendar = new GregorianCalendar();
//        LocalDateTime localDate = LocalDateTime;
        LocalDateTime ldt = LocalDateTime.ofInstant(dateInMilis, ZoneId.systemDefault());
        
        //checkJson and take data
        ReadJSONFile reader = new ReadJSONFile(array, ldt, prop);

        reader.execute();
    }

}
