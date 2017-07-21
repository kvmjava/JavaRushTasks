package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private int rost;
        private int ves;
        private char pol;
        private char cvetKoji;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, int rost) {
            this.name = name;
            this.age = age;
            this.rost = rost;
        }

        public Human(String name, int age, int rost, int ves) {
            this.name = name;
            this.age = age;
            this.rost = rost;
            this.ves = ves;
        }

        public Human(String name, int age, int rost, int ves, char pol) {
            this.name = name;
            this.age = age;
            this.rost = rost;
            this.ves = ves;
            this.pol = pol;
        }

        public Human(String name, char pol, char cvetKoji) {
            this.name = name;
            this.pol = pol;
            this.cvetKoji = cvetKoji;
        }

        public Human(String name, int age, int rost, int ves, char pol, char cvetKoji) {
            this.name = name;
            this.age = age;
            this.rost = rost;
            this.ves = ves;
            this.pol = pol;
            this.cvetKoji = cvetKoji;
        }

        public Human(String name, int age, char pol) {
            this.name = name;
            this.age = age;
            this.pol = pol;
        }

        public Human(String name, int age, char pol, char cvetKoji) {
            this.name = name;
            this.age = age;
            this.pol = pol;
            this.cvetKoji = cvetKoji;
        }

        public Human(char pol) {
            this.pol = pol;
        }
    }
}
