package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = new String[10];

        for (int i = 0; i < str1.length-2; i++) {
                str1[i] = str.readLine();
        }
        for (int i = str1.length - 1; i > -1; i--) {
            System.out.println(str1[i]);
        }
    }

}

