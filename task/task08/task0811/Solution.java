package com.javarush.task.task08.task0811;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Квартет «Методы»
*/

public class Solution {
    public static List getListForGet() {
        //напишите тут ваш код
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }
        return arrayList;
    }

    public static List getListForSet() {
        //напишите тут ваш код
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, i);
        }
        return arrayList;
    }

    public static List getListForAddOrInsert() {
        //напишите тут ваш код
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.add(i, i);
        }
        return linkedList;
    }

    public static List getListForRemove() {
        //напишите тут ваш код
        LinkedList linkedList = new LinkedList();
        for (int i = linkedList.size()-1; i >= 0; i--) {
            linkedList.remove(i);
        }
        return linkedList;
    }

    public static void main(String[] args) {

    }
}
