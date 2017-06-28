package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("F1", "Name1");
        hashMap.put("F2", "Name2");
        hashMap.put("F3", "Name3");
        hashMap.put("F4", "Name4");
        hashMap.put("F5", "Name5");
        hashMap.put("F6", "Name6");
        hashMap.put("F7", "Name1");
        hashMap.put("F8", "Name2");
        hashMap.put("F9", "Name1");
        hashMap.put("F10", "Name4");
        return hashMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int countFirstName = 0;
        for (HashMap.Entry<String, String> pair : map.entrySet())
        {
            String value = pair.getValue();                  //значение
            if (name == value)
             countFirstName++;
        }
        return countFirstName;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int countLastName = 0;
        for (HashMap.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();                      //ключ
            if (lastName == key) countLastName++;
        }
        return countLastName;

    }

    public static void main(String[] args) {
        //System.out.println(getCountTheSameFirstName(createMap(), "F1"));
        //System.out.println(getCountTheSameLastName(createMap(), "Name1"));
    }
}
