package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int mas [] = new int[5];

        for (int i = 0;i < 5; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < i-1; j++)
                if (mas[i] < mas[j]) {
                    int max = mas[i];
                    mas[i] = mas[j];
                    mas[j] = max;
                }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(mas[i]);
        }

    }
}
