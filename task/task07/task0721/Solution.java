package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        //напишите тут ваш код
        int[] mass = new int[20];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = Integer.parseInt(reader.readLine());
        }
        // минимальное значение
        for (int mMin: mass) {
            if (mMin <= minimum) {
                minimum = mMin;
            }
        }
        // максимальное значение
        for (int mMax : mass) {
            if (mMax > maximum) {
                maximum = mMax;
            }
        }
        System.out.println(maximum);
        System.out.println(minimum);
    }
}
