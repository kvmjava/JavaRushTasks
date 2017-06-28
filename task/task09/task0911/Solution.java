package com.javarush.task.task09.task0911;

import java.util.HashMap;

/* 
Исключение при работе с коллекциями Map
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
    try {
        method1();
    } catch (NullPointerException e){
        System.out.println(e);
    }

        //напишите тут ваш код
    }

    public static void method1() throws NullPointerException {
        HashMap<String, String> map = new HashMap<String, String>(null);
        map.put(null, null);
        map.remove(null);
    }
}
