package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        BufferedReader readString1 = new BufferedReader(new InputStreamReader(System.in));
        return readString1.readLine();
    }


    public static int readInt() throws Exception {
        //напишите тут ваш код
        BufferedReader readInt1 = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(readInt1.readLine());
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        BufferedReader readDouble1 = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(readDouble1.readLine());

    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        BufferedReader readBoolean1 = new BufferedReader(new InputStreamReader(System.in));
        return Boolean.parseBoolean(readBoolean1.readLine());
    }


    public static void main(String[] args){
/*

        System.out.println(readString());
        System.out.println(ConsoleReader.readInt());
        System.out.println(ConsoleReader.readDouble());
        System.out.println(ConsoleReader.readBoolean());
*/


    }
}
