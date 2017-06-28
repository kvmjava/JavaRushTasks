package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Пять победителей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        //всё умножаем на -1 потом сортируем, потом опять умножем на -1 (Гениально!)
        for (int i = 0; i < array.length; i++) array[i] *= -1;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) array[i] *= -1;

/*      //Валидацию прошёл
        Integer[] arr = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        //Collections.reverseOrder() - не работает с примитивом int. Сортирует в обратном порядке только тип Integer
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
             array[i] = arr[i];
        }
*/
    }
}
