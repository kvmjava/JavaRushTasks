package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.HashSet;
import java.util.Iterator;

        public class Solution {
            public static void main(String[] args) throws Exception {
                //напишите тут ваш код
                //арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель
                HashSet<String> HashSet = new HashSet<>();
                HashSet.add("арбуз");
                HashSet.add("банан");
                HashSet.add("вишня");
                HashSet.add("груша");
                HashSet.add("дыня");
                HashSet.add("ежевика");
                HashSet.add("жень-шень");
                HashSet.add("земляника");
                HashSet.add("ирис");
                HashSet.add("картофель");
                //получение итератора для множества
                Iterator<String> iterator = HashSet.iterator();

                while (iterator.hasNext()) {
                    String text = iterator.next();
                    System.out.println(text);
                }
            }
        }

