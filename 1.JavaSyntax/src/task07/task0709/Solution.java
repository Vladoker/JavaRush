package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 5; i++) strings.add(reader.readLine());
        int min = strings.get(0).length();

        for (String item : strings ) {
            if(min > item.length()) min = item.length();
        }
        for (String item : strings) {
            if(item.length() == min)
                System.out.println(item);
        }
    }
}
