package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        String str1;
        try {
            while (!((str1 = str.readLine()).equals("сумма"))) {
                sum += Integer.parseInt(str1);
            }
            System.out.println(sum);
        }catch(Exception err) {
        // Если произошла ошибка
            System.out.println("Ошибка! Чувак, ты что-то не то вводишь:" + err);
        }
    }
}
