package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] str = {"мама", "мыла", "раму"};
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <str.length ; i++) {
            list.add(i, str[i]);
        }
//        Collections.addAll(list, "мама", "именно", "мыла", "именно", "раму", "именно"); //можно и так добавить в массив
        for (int i = 1; i <list.size()+1 ; i+=2) {
            list.add(i, "именно");
        }
        for (String x: list) {
            System.out.println(x);
        }
    }
}
