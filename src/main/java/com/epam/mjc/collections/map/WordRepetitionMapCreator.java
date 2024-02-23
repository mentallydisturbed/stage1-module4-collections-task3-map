package com.epam.mjc.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new TreeMap<>();
        String[] words = sentence.split("[ ]|[.]|[,]");
        for (String s:
             words) {
            if(s.length() > 0) {
                if(map.containsKey(s.toLowerCase())) {
                    map.replace(s.toLowerCase(), map.get(s.toLowerCase()) + 1);
                }else {
                    map.put(s.toLowerCase(), 1);
                }
            }
        }
        return map;
    }
}
