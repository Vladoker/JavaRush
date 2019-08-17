package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        int[] size = new int[33];
        for (int i = 0; i < list.size(); i++) {
            char[] abcStr = list.get(i).toCharArray();

            for (int j = 0; j < abcStr.length; j++) {
                if (alphabet.contains(abcStr[j]))size[alphabet.indexOf(abcStr[j])] += 1;
            }

        }

        for (int i = 0; i < abcArray.length; i++) {
            System.out.println(abcArray[i] + " " + size[i]);
        }


    }

}
