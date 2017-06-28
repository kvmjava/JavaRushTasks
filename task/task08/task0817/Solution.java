package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("F1", "N11111");
        map.put("F2", "N11111");
        map.put("F3", "N2");
        map.put("F4", "N33333");
        map.put("F5", "N33333");
        map.put("F6", "N33333");
        map.put("F7", "N33333");
        map.put("F8", "N33333");
        map.put("F9", "N4");
        map.put("F10", "N5");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<String> nameListDouble = new ArrayList<>();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (nameList.contains(pair.getValue())) {
                nameListDouble.add(pair.getValue());
            } else {
                nameList.add(pair.getValue());
            }
        }
        System.out.println(nameListDouble);
        for (String name: nameListDouble) {
                removeItemFromMapByValue(map, name);
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
//        removeTheFirstNameDuplicates(createMap());
    }
}
