package com.javarush.task.task07.task0720;

import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код

        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(i, reader.readLine());
        }
        // можно через методы, вот так:
         list.addAll(list.subList(0, m));
         list.removeAll(list.subList(0, m));
        //а можно через цикл
/*        for (int i = 0; i < m; i++) {
            list.add(list.size(), list.get(0));
            list.remove(0);
        }*/
        for (String aList : list) {
            System.out.println(aList);
        }
    }
}
