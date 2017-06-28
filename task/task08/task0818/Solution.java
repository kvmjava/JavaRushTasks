package com.javarush.task.task08.task0818;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();
        map.put("F1", 400);
        map.put("F2", 700);
        map.put("F3", 800);
        map.put("F4", 400);
        map.put("F5", 300);
        map.put("F6", 310);
        map.put("F7", 550);
        map.put("F8", 560);
        map.put("F9", 1000);
        map.put("F10", 130);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        ArrayList<String> mapKey = new ArrayList<>();
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue() < 500 ) {
                mapKey.add(pair.getKey());
            }
        }
        for (String key: mapKey) {
            map.remove(key);
        }
    }


    public static void main(String[] args) {
//        removeItemFromMap(createMap());
    }
}