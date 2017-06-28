package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;

/*
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

        public static boolean isDateOdd(String date) {

            ArrayList<String> importDate = new ArrayList<>();
            importDate.addAll(Arrays.asList(date.split(" ")));

        String month = importDate.get(0);
        int day = Integer.parseInt(importDate.get(1));
        int year = Integer.parseInt(importDate.get(2));
        LocalDate specDate = LocalDate.of(year, Month.valueOf(month), day);
            System.out.println(specDate.getDayOfYear()+1);
        return (specDate.getDayOfYear()+1) % 2 == 0;

    }
}




