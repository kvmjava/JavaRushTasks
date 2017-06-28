package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/
import java.util.Date;
import java.text.SimpleDateFormat;


public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Date d = new Date();
        SimpleDateFormat dmy = new SimpleDateFormat("dd MM yyyy");
        System.out.println(dmy.format(d));
        System.out.println(d);

    }
}
