package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        char[] chArray = new BufferedReader(new InputStreamReader(System.in)).readLine().replace(" ", "").toCharArray();
        ArrayList <Character> strVowel = new ArrayList<>();
        ArrayList <Character> strNotVowel = new ArrayList<>();

        for (Character ch : chArray){
            if (isVowel(ch)) {
                strVowel.add(strVowel.size(), ch);
            } else {
                strNotVowel.add(strNotVowel.size(), ch);
            }
        }
        for (Character sV : strVowel){
            System.out.print(sV + " ");
        }
        System.out.println();
        for (Character sNV : strNotVowel){
            System.out.print(sNV + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}