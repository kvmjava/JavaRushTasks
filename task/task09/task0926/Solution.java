package com.javarush.task.task09.task0926;

import java.util.ArrayList;



/* 
Список из массивов чисел
Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> arrayList = new ArrayList<>();
        arrayList.add(new int[]{1,2,3,4,5});
        //
        arrayList.add(new int[]{6,7});
        arrayList.add(new int[]{8,9,10,11});
        arrayList.add(new int[]{12,13,14,15,16,17,18});
        arrayList.add(new int[]{});
        return arrayList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
