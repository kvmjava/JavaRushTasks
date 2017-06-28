package com.javarush.task.task08.task0816;

import java.util.*;
import java.text.SimpleDateFormat;

/*
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone1", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date("JUNE 1 1980"));
        map.put("Stallone3", new Date("JUNE 1 1980"));
        map.put("Stallone4", new Date("JUNE 1 1980"));
        map.put("Stallone5", new Date("JUNE 1 1980"));
        map.put("Stallone6", new Date("JUNE 1 1980"));
        map.put("Stallone7", new Date("JUNE 1 1980"));
        map.put("Stallone8", new Date("JUNE 1 1980"));
        map.put("Stallone9", new Date("JULY 1 1980"));
        map.put("Stallone10", new Date("SEPTEMBER 1 1980"));
        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код

        //создаём массив куда запишем все ключи map-а для последующего удаления пары ключа-значения из map-a (удаление по ключу делается)
        ArrayList<String> removeList = new ArrayList<>();
        for (HashMap.Entry<String, Date> pair : map.entrySet()) {
            int m = pair.getValue().getMonth();
            if (m > 4 && m < 8) { //месяцы в getMonth() считаются от нуля, следовательно летние месяцы будут под номерами 5,6,7
                removeList.add(pair.getKey());
            }
        }
        for (String key: removeList){
            map.remove(key);
        }
    }
    public static void main(String[] args) {
//        removeAllSummerPeople(createMap());
    }
}
