package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList <String> list = new ArrayList <String> ();
        list.add("str1");
        list.add("str2");
        list.add("Str3");
        list.add("Str4");
        list.add("Str5");
        System.out.println(list.size());
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }

}
