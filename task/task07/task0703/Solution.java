package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    //public static int varmas = 10;
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));

        String[] masStr = new String[10];
        int[] masInt = new int[10];

        for (int i = 0; i < masStr.length; i++) {
            masStr[i] = str.readLine();
            masInt[i] = masStr[i].length();
            System.out.println(masInt[i]);
        }

/*

        for (int i = 0; i < varmas; i++) {
            System.out.println("masStr: " + masStr[i].length());
            System.out.println("masInt: " + masInt[i]);
        }

*/

    }
}
