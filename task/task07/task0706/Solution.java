package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        int[] intMass = new int[15];
        int ch = 0;
        int nch = 0;
        for (int i = 0; i < intMass.length; i++) {intMass[i] = Integer.parseInt(str.readLine());
            if ((i % 2) == 0) ch += intMass[i];
            else nch += intMass[i];
        }
        System.out.println(ch > nch ? "В домах с четными номерами проживает больше жителей." : "В домах с нечетными номерами проживает больше жителей.");
    }
}
