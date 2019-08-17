package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       int[] mas = new int[15];
       int even = 0;
       int odd = 0;


        for (int i = 0; i < 15; i++) {
            mas[i] = Integer.parseInt(reader.readLine());

            if (i%2 == 0)even += mas[i];
            else odd += mas[i];
        }
        System.out.println(even > odd ? "В домах с четными номерами проживает больше жителей.":"В домах с нечетными номерами проживает больше жителей.");
    }
}
