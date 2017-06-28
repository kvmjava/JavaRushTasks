package com.javarush.task.task06.task0606;

import java.io.*;
import  java.lang.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        //int si = Integer.parseInt(ss); //get integer from str
        String ss = str.readLine();  //get string from str
        for (int i = 0; i < ss.length() ; i++) {
            int i1 = ss.charAt(i); //преобразовываем char в int
            if (i1%2 == 0){
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
