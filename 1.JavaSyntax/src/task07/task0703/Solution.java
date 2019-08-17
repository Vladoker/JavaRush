package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String [] mas = new String[10];
        int [] mas_int = new int [10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            mas[i] = reader.readLine();
        }

        for (int i = 0; i < 10; i++) {
            mas_int[i] = mas[i].length();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(mas_int[i]);
        }


    }
}
