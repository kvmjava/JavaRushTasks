package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> catsMap = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            String n = "Name" + i;
            catsMap.put(n, new Cat(n));
        }
        return catsMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        //можно сокращённой записью:
        //return new HashSet <>(map.values());

        //или вот так:
        HashSet<Cat> cats = new HashSet<>();
                Set<Map.Entry<String, Cat>> set = map.entrySet();
                for (Map.Entry<String, Cat> me : set) {
                        cats.add(me.getValue());
                    }
                return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
