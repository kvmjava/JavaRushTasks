package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код

        //можно ещё через создание коллекции в отдельном массиве ArrayList, а потом удаление по этой коллекции
        //махом всех элементов removeAll() в исходном интерфейсе Set, вот так:
        /* ArrayList dels = new ArrayList<>(); Iterator i = set.iterator(); while (i.hasNext()) { int n = i.next(); if (n > 10) { dels.add(n); } } set.removeAll(dels); */

        //решение через клонирование интерфейса Set и удаление и последующего возврата изменёного клона
        HashSet setClone = (HashSet) set.clone();
        for (Object xElement: set) {
            if ((int)xElement > 10) {
                setClone.remove((int)xElement);
            }
        }
        return setClone;
    }

    public static void main(String[] args) {
        System.out.println(removeAllNumbersMoreThan10(createSet()));
    }
}
