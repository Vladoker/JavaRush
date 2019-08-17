package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<>();

        map.put("Зева", new Cat("Зева"));
        map.put("Армани", new Cat("Армани"));
        map.put("Чернышь", new Cat("Чернышь"));
        map.put("Матроскин", new Cat("Мантроскин"));
        map.put("Акулычь", new Cat("Акулычь"));
        map.put("Серый", new Cat("Серый"));
        map.put("Уголёк", new Cat("Уголёк"));
        map.put("Лапкин", new Cat("Лапкин"));
        map.put("Соня", new Cat("Соня"));
        map.put("Простокваша", new Cat("Простокваша"));

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<>(5);
        for (Map.Entry<String, Cat> iter: map.entrySet()) set.add(iter.getValue());

        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
