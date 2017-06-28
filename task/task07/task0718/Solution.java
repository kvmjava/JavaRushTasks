package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i, str.readLine());
        }

        int dlin = list.get(0).length();
        for (int i = 1; i < list.size(); i++) {
            if (dlin > list.get(i).length()) {
                System.out.println(i);
                break;
            } else {
                dlin = list.get(i).length();
            }
        }
    }
}

