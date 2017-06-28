package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        //бабушка и дедушка, родитеи Бориса
        Human grMam1 = new Human("mamBorisa", false, 55);
        System.out.println(grMam1.toString());
        Human grPap1 = new Human("papBorisa", true, 54);
        System.out.println(grPap1.toString());

        //бабушка и дедушка, родители Сони
        Human grMam2 = new Human("mamSonya", false, 61);
        System.out.println(grMam2.toString());
        Human grPap2 = new Human("papSonya", true, 60);
        System.out.println(grPap2.toString());

        //их родители
        Human perMather = new Human("Sonya", false, 30, grPap2, grMam2);
        System.out.println(perMather.toString());
        Human perFather = new Human("Boris", true, 32, grPap1, grMam1);
        System.out.println(perFather.toString());

        //дети
        Human child1 = new Human("Anya", false, 1, perFather, perMather);
        System.out.println(child1.toString());
        Human child2 = new Human("Liza", false, 2,  perFather, perMather);
        System.out.println(child2.toString());
        Human child3 = new Human("Vasya", true, 3,  perFather, perMather);
        System.out.println(child3.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















