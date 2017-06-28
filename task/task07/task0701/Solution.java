package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    //public static int lig = 20;

    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        int[] x = new int[20];
        for (int i = 0; i < x.length; i++) {
            x[i] = Integer.parseInt(str.readLine());
            System.out.println(x[i]);
        }
        return x;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int max = 0;
        for (int i = 0; i < 20; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
