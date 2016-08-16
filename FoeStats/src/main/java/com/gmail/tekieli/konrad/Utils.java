package com.gmail.tekieli.konrad;

import org.json.JSONObject;

public class Utils {

    public static Boolean setValueBoolean(String fieldName, JSONObject obj) {
        Boolean ret = null;
        try {
            ret = obj.getBoolean(fieldName);
        } catch (Exception e) {
        }
        return ret;
    }
    
    public static Integer setValueInt(String fieldName, JSONObject obj) {
        Integer ret = (Integer) null;
        try {
            ret = obj.getInt(fieldName);
        } catch (Exception e) {
        }
        return ret;
    }
    
    public static String setValueString(String fieldName, JSONObject obj) {
        String ret = null;
        try {
            ret = obj.getString(fieldName);
        } catch (Exception e) {
        }
        return ret;
    }
    
    public static Double setValueDouble(String fieldName, JSONObject obj) {
        Double ret = null;
        try {
            ret = obj.getDouble(fieldName);
        } catch (Exception e) {
        }
        return ret;
    }

    public static Long setValueLong(String fieldName, JSONObject obj) {
        Long ret = (Long) null;
        try {
            ret = obj.getLong(fieldName);
        } catch (Exception e) {
        }
        return ret;
    }

}
