package com.javarush.task.task08.task0813;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        String[] mas = {"Лена", "Лампа", "Лама", "Лошадь", "Лимонад", "Лазер", "Ларёк", "Лавка", "Ламинат", "Лодка", "Лаберинт",
                "Ликёр", "Лакомство", "Лекарство", "Лом", "Ладышка", "Ламба", "Ламбарт", "Лапка", "Литр"};
        Set<String> set = new HashSet<>(Arrays.asList(mas));
        return set;
    }

    public static void main(String[] args) {

    }
}
