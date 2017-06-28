package com.javarush.task.task10.task1003;

/* 
Задача №3 на преобразование целых типов
Добавить одну операцию по преобразованию типа, чтобы получался ответ: b=0
*/

public class Solution {
    public static void main(String[] args) {
        float f = (float) 128.50;
        int i = (int) f;
        int b = (byte)(int) (i + f);
        System.out.println(b);
    }
}
