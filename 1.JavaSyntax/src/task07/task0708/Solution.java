package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        strings = new ArrayList<>();

        for (int i = 0; i < 5; i++) strings.add(reader.readLine());
        int max = 0;

        for (String item : strings ) {
            if(max < item.length()) max = item.length();
        }
        for (String item : strings) {
            if(item.length() == max)
                System.out.println(item);
        }





    }
}
