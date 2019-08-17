package com.javarush.task.task08.task0823;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

       char[] mas = s.toCharArray();

       mas[0]= Character.toUpperCase(mas[0]);

        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] == ' ') mas[i + 1] = Character.toUpperCase(mas[i + 1]);
        }

        s = new String(mas);

        System.out.println(s);
    }
}
