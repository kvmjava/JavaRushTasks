package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

import static java.lang.Math.sqrt;

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код
        // формула такая: кв. корень из ((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2))
        return Math.sqrt(((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)));
    }

    public static void main(String[] args) {

//        System.out.println(Util.getDistance(1,2,3,4));

    }
}
