package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        //заносим с клавы строки
        for (int i = 0; i < 5; i++) {
            list.add(i, str.readLine());
        }
        //находим самую длинную строку в массиве и сохраняем длинну в maxValue
        int maxValue=0;
        for (String aList : list) {
            if (aList.length() >= maxValue) {
                maxValue = aList.length();
            }
        }
        //находим все строки в массиве с такой же максимальной длинной и выводим на экран
        for (String aListMax : list) {
            if (aListMax.length() == maxValue){
                System.out.println(aListMax);
            }
        }
    }
}


