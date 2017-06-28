package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
/*      //мой валидный вариант
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; ; i++) {
            String str = reader.readLine();
            if (!str.equals("end")){
                list.add(list.size(), str);
            } else {break;}
        }
        for (String aList: list){
            System.out.println(aList);
        }
*/

        //короткий вариант через while
        ArrayList<String> list = new ArrayList<>();
        String buf;
        while (!(buf = reader.readLine()).equals("end")){
            list.add(buf);
        }
        for (String aList: list){
            System.out.println(aList);
        }


    }
}