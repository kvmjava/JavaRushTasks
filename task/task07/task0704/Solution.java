package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        int[] masInt = new int[10];
        int[] masInt1 = new int[10];
        for (int i = 0; i < masInt.length; i++) {
            masInt[i] = Integer.parseInt(str.readLine());
            masInt1[masInt.length-1-i]=masInt[i];
        }
        for (int i = 0; i < 10 ; i++) {
            System.out.println(masInt1[i]);
        }
    }
}

