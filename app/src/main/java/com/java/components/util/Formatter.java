package com.java.components.util;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.java.components.Prints.*;

public class Formatter {
    HashMap<Integer, Object> format = new HashMap<Integer, Object>();
    HashMap<Integer, String> strings = new HashMap<Integer, String>();
    HashMap<Integer, Boolean> booleans = new HashMap<Integer, Boolean>();
    HashMap<Integer, Character> characters = new HashMap<Integer, Character>();
    HashMap<Integer, Number> numbers = new HashMap<Integer, Number>();
    public Formatter() {}


    public String format(String str, Object... args) {
        int idxA = 0, idxS = 0, idxB = 0, idxC = 0, idxN = 0, idx = 0;
        
        for(int i = 0; i < args.length; i++) {
            if(args[i].toString().contains("$&")) {
                String temp = args[i].toString().replace("$&", "").replaceAll(" *", "");
                args[i] = args[i].toString().replace("$&", temp);
            }
        }
        for (; idxA < args.length; idxA++) {
            format.put(idxA, args[idxA]);
        }
        for (idx = 0; idxS < args.length; idxS++) {
            if (args[idxS] instanceof String s) {
                strings.put(idx, s);
                idx++;
            }
        }
        for (idx = 0; idxC < args.length; idxC++) {
            if (args[idxC] instanceof Character c) {
                characters.put(idx, c);
                idx++;
            }
        }
        for (idx = 0; idxB < args.length; idxB++) {
            if (args[idxB] instanceof Boolean b) {
                booleans.put(idx, b);
                idx++;
            }
        }
        for (idx = 0; idxN < args.length; idxN++) {
            if (args[idxN] instanceof Number n) {
                numbers.put(idx, n);
                idx++;
            }
        }

        for (int i = 0; i < strings.size(); i++) {
            Matcher m = Pattern.compile("\\$\\{(\\d+):(.*?):s\\};").matcher(str);
            while(m.find()) {
                String tt = m.group();
                String subStr = "";
                String indexStr = "";
                Matcher m1 = Pattern.compile(Pattern.quote(":") + "(.*?)" + Pattern.quote(":")).matcher(tt);
                Matcher m2 = Pattern.compile(Pattern.quote("{") + "(\\d+)" + Pattern.quote(":")).matcher(tt);
                while(m1.find()) subStr = m1.group();
                while(m2.find()) indexStr = m2.group();
                if(i != Integer.valueOf(indexStr.substring(1, indexStr.length() - 1))) {
                    String temp = subStr.substring(1, subStr.length() - 1).replace("$&", "").replaceAll(" *", "");
                    subStr = subStr.replace("$&", temp);
                    str = str.replace(tt, subStr.substring(1, subStr.length() - 1));
                }
                else str = str.replace(tt, strings.get(i));
                format.remove(getKey(format, strings.get(i)));
                format = resize(format);
            }
            if(str.contains("${" + i + ":s};")) {
                str = str.replace("${" + i + ":s};", strings.get(i));
                format.remove(getKey(format, strings.get(i)));
                format = resize(format);
            }
        }
        for (int i = 0; i < characters.size(); i++) {
            if(str.contains("${" + i + ":c};")) {
                str = str.replace("${" + i + ":c};", String.valueOf(characters.get(i)));
                format.remove(getKey(format, String.valueOf(characters.get(i))));
                format = resize(format);
            }
        }
        for (int i = 0; i < booleans.size(); i++) {
            if(str.contains("${" + i + ":b};")) {
                str = str.replace("${" + i + ":b};", String.valueOf(booleans.get(i)));
                format.remove(getKey(format, String.valueOf(booleans.get(i))));
                format = resize(format);
            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            if(str.contains("${" + i + ":n};")) {
                str = str.replace("${" + i + ":n};", String.valueOf(numbers.get(i)));
                format.remove(getKey(format, String.valueOf(numbers.get(i))));
                format = resize(format);
            }
        }
        for (int i = 0; i < format.size(); i++) {
            if(str.contains("${" + i + "};")) {
                str = str.replace("${" + i + "};", String.valueOf(format.get(i)));
            }
        }

        return str;
    }

    public HashMap<Integer, Object> resize(HashMap<Integer, Object> map) {
        int i = 0;
        Object[] newObject = new Object[map.size()];
        for(Object o : map.values()) {
            newObject[i] = o;
            i++;
        }
        map = new HashMap<>();
        for (int idx = 0; idx < newObject.length; idx++) {
            map.put(idx, newObject[idx]);
        }
        return map;
    }

    public Integer getKey(HashMap<Integer, Object> map, String value) {
        for(Map.Entry<Integer, Object> entry : map.entrySet()) {
            if(entry.getValue().toString().equals(value)) return entry.getKey();
        }
        return null;
    }
}
