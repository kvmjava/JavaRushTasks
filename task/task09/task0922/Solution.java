package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try {
            String s = new BufferedReader(new InputStreamReader(System.in)).readLine();

            Date s1 = new Date();
            s1.setDate(Integer.parseInt(s.substring(3,5)));
            s1.setMonth(Integer.parseInt(s.substring(0,2))-1);
            s1.setYear(Integer.parseInt(s.substring(6,10))-1900);

            SimpleDateFormat strInvertToDate = new SimpleDateFormat("MMM dd, YYYY", Locale.ENGLISH);
            System.out.println(strInvertToDate.format(s1).toUpperCase());
        } catch (Exception e) {
            System.out.println("Неправильный ввод данных. Введите в формате: MM/DD/YYYY");
        }

        /* //Можно s и сразу в new Date() запихнуть, вот такая реализация:
        String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
        Date date = new Date(s);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, YYYY", Locale.ENGLISH);
        System.out.println(dateFormat.format(date).toUpperCase());*/

    }
}
