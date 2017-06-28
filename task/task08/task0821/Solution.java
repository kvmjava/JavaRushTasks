package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map createPeopleList() {
        //напишите тут ваш код
        Map map = new HashMap<>();
        map.put("LastName1", "FirstName1");
        map.put("LastName1", "FirstName1");
        map.put("LastName2", "FirstName1");
        map.put("LastName2", "FirstName2");
        map.put("LastName3", "FirstName2");
        map.put("LastName3", "FirstName2");
        map.put("LastName4", "FirstName3");
        map.put("LastName4", "FirstName3");
        map.put("LastName5", "FirstName3");
        map.put("LastName5", "FirstName4");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
