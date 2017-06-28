package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("Yurik", 0, null);
        Man man2 = new Man("Fedya", 21, "1st Mitino st. 10");

        Woman woman1 = new Woman("Sveta", 20, "");
        Woman woman2 = new Woman("Natasha", 25, "2th Policarpova st.");
            String name = "\"Нет данных по возрасту\"";
            System.out.println(man1.name + " " + (man1.age == 0? name: man1.age) + " " + man1.address);
            System.out.println(man2.name + " " + (man2.age == 0? name: man2.age) + " " + man2.address);
            System.out.println(woman1.name + " " + (woman1.age == 0? name: woman1.age) + " " + woman1.address);
            System.out.println(woman2.name + " " + (woman2.age == 0? name: woman2.age) + " " + woman2.address);

    }

    //напишите тут ваш код
    public static class Man {
        String name = "noname";
        int age = 0;
        String address = null;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

    }
    public static class Woman {
        String name = "noname";
        int age = 0;
        String address = null;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
