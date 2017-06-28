package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set cats = createCats();
        Set dogs = createDogs();

        Set pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set createCats() {
        Set resultCat = new HashSet<>();

        //напишите тут ваш код
        resultCat.add(new Cat());
        resultCat.add(new Cat());
        resultCat.add(new Cat());
        resultCat.add(new Cat());

        return resultCat;
    }

    public static Set createDogs() {
        //напишите тут ваш код
        Set resultDog = new HashSet<>();
        resultDog.add(new Dog());
        resultDog.add(new Dog());
        resultDog.add(new Dog());
        return resultDog;
    }

    public static Set join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set catdog = new HashSet<>();
        catdog.addAll(cats);
        catdog.addAll(dogs);

        return catdog;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object petss: pets) {
            System.out.println(petss);
        }
    }

    //напишите тут ваш код
    public static class Cat {
    }

    public static class Dog{
    }
}
