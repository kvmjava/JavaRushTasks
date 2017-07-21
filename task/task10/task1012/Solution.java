package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


/*
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        // напишите тут ваш код

        //вызываем метод подсчёта 1 символа в строке
        for (Character ch : alphabet) {
            System.out.println(ch + " " + schetCh(list, ch));
        }
    }
    //метод который подсчитывает кол-во встречающихся символов в 1 строке
    private static int schetCh(ArrayList<String> list, Character ch){
        int kolvo = 0;
        for (String elementList : list) {
            for (int i = 0; i < elementList.length(); i++) {
                if (elementList.charAt(i) == ch) kolvo++;
            }
        }
        return kolvo;
    }
}
