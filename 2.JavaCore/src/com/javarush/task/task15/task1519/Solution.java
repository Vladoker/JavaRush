package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        boolean shortfalse;

        while (!str.equals("exit"))
        {
            shortfalse = true;
            if (str.contains("."))
            {
                try {
                    print(Double.parseDouble(str));
                    shortfalse = false;
                }
                catch (Exception ex){}
            }
            try {
                if (Short.parseShort(str) > 0 && Short.parseShort(str) < 128) {
                    print(Short.parseShort(str));
                    shortfalse = false;
                }
            }
            catch (Exception ex){}

            if (shortfalse) {
                try {
                    if (Integer.parseInt(str) <= 0 || Integer.parseInt(str) >= 128) print(Integer.parseInt(str));
                    else print(str);
                } catch (Exception ex) {print(str);}

            }

            str = reader.readLine();
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
