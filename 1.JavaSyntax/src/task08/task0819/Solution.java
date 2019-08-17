package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

       cats.remove(cats.iterator().hasNext()?cats.iterator().next():null); //cats.toArray()[2]

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>(3);
        cats.add(new Cat("Рыжик"));
        cats.add(new Cat("Матроскин"));
        cats.add(new Cat("Зева"));

        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat()
        {
            name = "Бездомный";
        }
        public Cat(String name)
        {
            this.name = name;
        }

//        public String toString()
//        {
//            return this.name;
//        }


    }
}
