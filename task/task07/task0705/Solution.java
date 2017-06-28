package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        int[] intMass = new int[20];
        int[] intMass1 = new int[10];
        int[] intMass2 = new int[10];

        for (int i = 0; i < intMass.length; i++) {
            intMass[i] =Integer.parseInt(str.readLine());
            if (i <10) {
                intMass1[i]=intMass[i];
            } else {
                intMass2[i-10]=intMass[i];
            }
        }
        for (int i = 0; i < 10 ; i++) {
            System.out.println(intMass2[i]);
        }
        /* Можно и через метод arraycopy класса System сделать копирование из массива в массив:
        arraycopy(Object src,  int  srcPos,
        Object dest, int destPos,
        int length);*/
        //System.arraycopy(intMass, 0, intMass1, 0, 10);
        //System.arraycopy(intMass, 10, intMass2, 0, 10);
    }
}
