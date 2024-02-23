package com.epam.mjc.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new TreeMap<>();
        for (Integer i:
             sourceMap.keySet()) {
            String value = sourceMap.get(i);
            if(map.containsKey(value)) {
                if (map.get(value) > i) {
                    map.replace(value, map.get(value), i);
                }
            }else {
                map.put(value, i);
            }
        }
        return map;
    }
}
