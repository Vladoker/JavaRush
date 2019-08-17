package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> mas = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            mas.add(reader.readLine());
        }
        for (int i = 0; i < 13; i++) {
           String temp = mas.get(4);
           mas.remove(4);
           mas.add(0,temp);
        }

        for (String s : mas) {
            System.out.println(s);
        }
    }
}
