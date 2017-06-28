package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        //заносим с клавы строки
        for (int i = 0; i < 5; i++) {
            list.add(str.readLine());
        }
        for (int i = 0; i < 13; i++) {
            list.add(0, list.remove(list.size()-1)); //в одной строке сразу присваиваем и удаляем строку из массива
            //list.remove(list.size()-1); //удаляем последнюю строку из массива
        }
        for (String aList : list) {
            System.out.println(aList);
        }
    }
}
