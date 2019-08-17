package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> mas = new ArrayList<>();

        mas.add("Самый");
        mas.add("Крутой");
        mas.add("Язык");
        mas.add("Программирования");
        mas.add("С++");

        System.out.println(mas.size());

        for (String item : mas) {
            System.out.println(item);
        }
    }
}
