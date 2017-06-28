package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList <Integer> arrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            arrayList.add(i, Integer.parseInt(reader.readLine()));
        }
        int max = 1;
        int count = 1;
        for (int i=1; i <10; i++) {
            if ((arrayList.get(i).equals(arrayList.get(i - 1)))){
                count++;
            } else {
                count = 1;
            }
            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);
    }
}