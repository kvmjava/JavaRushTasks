package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
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
        //находим самую короткую строку в массиве и сохраняем длинну в minValue
        int minValue=Integer.MAX_VALUE; // максимально значение что может принять переменная типа integer 2^31 = 2 147 483 648
        for (String aList : list) {
            if (aList.length() <= minValue) {
                minValue = aList.length();
            }
        }
        //находим все строки в массиве с такой же min длинной и выводим на экран
        for (String aListMax : list) {
            if (aListMax.length() == minValue){
                System.out.println(aListMax);
            }
        }
    }
}
