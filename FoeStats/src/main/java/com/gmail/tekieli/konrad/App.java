package com.gmail.tekieli.konrad;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        Properties prop = new Properties();

            try {
                prop.load(App.class.getResourceAsStream("/app.properties"));
                final Logger logger = LoggerFactory.getLogger(App.class);
                logger.debug("START");
                Path folder = Paths.get(prop.getProperty("pathJSON"));
                FoeFileWatch foeFileWatch = new FoeFileWatch(folder, prop); 

                foeFileWatch.watchDirectoryPath();

            } catch (IOException e) {
                e.printStackTrace();
            }
        
        		
    }
}
