package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.Arrays;


/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код

        ArrayList<String>[] massSpiskiStrok = new ArrayList[3];

        ArrayList<String> aMass1 = new ArrayList<String>();
        ArrayList<String> aMass2 = new ArrayList<String>();
        ArrayList<String> aMass3 = new ArrayList<String>();

        aMass1.add("mass 1 stroka 1");
        aMass1.add("mass 1 stroka 2");
        aMass1.add("mass 1 stroka 3_");

        aMass2.add("mass 2 stroka 1");
        aMass2.add("mass 2 stroka 2__");

        aMass3.add("mass 3 stroka 1");
        aMass3.add("mass 3 stroka 2");
        aMass3.add("mass 3 stroka 3");
        aMass3.add("mass 3 stroka 4___");

        massSpiskiStrok[0] = aMass1;
        massSpiskiStrok[1] = aMass2;
        massSpiskiStrok[2] = aMass3;

        return massSpiskiStrok;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}