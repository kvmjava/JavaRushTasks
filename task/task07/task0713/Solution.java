package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list_Top = new ArrayList<>();
        //заносим с клавы строки
        for (int i = 0; i < 20; i++) {
            list_Top.add(Integer.parseInt(str.readLine()));
        }
        ArrayList<Integer> listDelTo_3 = new ArrayList<>();
        ArrayList<Integer> listDelTo_2 = new ArrayList<>();
        ArrayList<Integer> listOther = new ArrayList<>();
        for (Integer x : list_Top) {
            if (x % 3 == 0 && x % 2 == 0){
                listDelTo_3.add(x); // добавляем x в коллекцию которые делятся без остатка на 3
                listDelTo_2.add(x); // добавляем x в коллекцию которые делятся без остатка на 2
            } else {
            if (x % 3 == 0) { //если x - делится без остатка на 3
                listDelTo_3.add(x); // добавляем x в коллекцию которые делятся без остатка на 3
            } else {
                if (x % 2 == 0) { //если x - делится без остатка на 2
                    listDelTo_2.add(x); // добавляем x в коллекцию которые делятся без остатка на 2
                    } else {
                    listOther.add(x); // добавляем x в коллекцию которые не делятся без остатка на 2 или 3
                    }
            }
            }
        }
        printList(listDelTo_3);
        printList(listDelTo_2);
        printList(listOther);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (Integer aList : list) {
            System.out.println(aList);
        }
    }
}
