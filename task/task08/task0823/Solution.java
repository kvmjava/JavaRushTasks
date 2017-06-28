package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        //преобразовываем строку в массив
        char[] chArray = s.toCharArray();
        //перебираем все элементы массива
        chArray[0] = Character.toUpperCase(s.charAt(0));
        for(int i = 0; i < chArray.length; i++){
            // если достигли конца то перрываем процедуру иначе если в конце стоит пробел,
            // то будет ошибка при замене на заглавную букву следующего элемента массима
            if (i == chArray.length-1) break;
            //находим пробел
            if(chArray[i] == ' '){
                //заменяем следующий символ на заглавную
                chArray[i+1] = Character.toUpperCase(s.charAt(i+1));
            }
        }
        System.out.println(chArray);

/*
        //можно и в строке сразу менять, вот такой код не вызывает ошибки если в конце пробел стоит
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (str.equals(" ") || str.equals("")) System.out.print(s.substring(i, i+1).toUpperCase());
            else System.out.print(s.substring(i, i+1));
            str = s.substring(i, i+1);
        }*/


    }
}
