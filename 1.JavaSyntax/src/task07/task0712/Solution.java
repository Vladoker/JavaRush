package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       ArrayList<String> mas = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            mas.add(reader.readLine());
        }

        String str = mas.get(0);
        String str1 = mas.get(0);

        for (int i = 0; i < 10; i++) {
            if (mas.get(i).length() > str.length()) str = mas.get(i);
            if (mas.get(i).length() < str1.length()) str1 = mas.get(i);
        }

        for (int i = 0; i < 10; i++)
        {
            if (mas.get(i) == str || mas.get(i) == str1)
            {
                System.out.println(mas.get(i));
                break;
            }
        }
    }
}
