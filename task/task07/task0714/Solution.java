package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Слова в обратном порядке
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
        list.remove(2);
        for (int i = list.size()-1; i > -1; i--) {
            System.out.println(list.get(i));
        }

    }
}


