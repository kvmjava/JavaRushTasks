package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        //заносим с клавы строки
        for (int i = 0; i < 10; i++) {
            list.add(str.readLine());
        }

        int maxValue=0;
        int minValue=Integer.MAX_VALUE; // максимально значение что может принять переменная типа integer 2^31 = 2 147 483 648
        for (String aList : list) {
            if (aList.length() >= maxValue) { //находим самую длинную строку в массиве и сохраняем длинну в maxValue
                maxValue = aList.length();
            }
            if (aList.length() <= minValue) { //находим самую короткую строку в массиве и сохраняем длинну в minValue
                minValue = aList.length();
            }
        }
        //находим строку встретившуюся первой, короткая или длинная и выводим на экран.
        for (String aList : list) {
            if (aList.length() == minValue){
                System.out.println(aList);
                break;
            } else {
                if (aList.length() == maxValue){
                    System.out.println(aList);
                    break;
                }
            }
        }
    }
}


