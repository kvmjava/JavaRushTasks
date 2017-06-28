package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        ArrayList<Integer> inList = new ArrayList<>();
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true){
                inList.add(Integer.parseInt(str.readLine()));
            }
        } catch (Exception e) {
            for (int i = 0; i < inList.size(); i++) {
                System.out.println(inList.get(i));
            }
        }
    }
}


