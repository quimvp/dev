package com.java.components.util;

import java.util.*;


public class HashMaps<K, V> extends HashMap<K, V> {
    private HashMap<K, V> map;

    public HashMaps(HashMap<K, V> map) {
        this.map = map;
    }

    public Object getKey(V value, int index) {
        return getKey(value, null, index);
    }

    public Object getKey(V value, V defaults, int index) {
        int i = 0;
        for(Map.Entry<K, V> entry : map.entrySet()) {
            i++;
            if(entry.getValue().equals(value))
                if(i == index) return entry.getKey();
        }
        return defaults;
    }

    public Object getKey(V value) {
        return getKey(value, 1);
    }

    public Object getKey(V value, V defaults) {
        return getKey(value, defaults, 1);
    }
}
