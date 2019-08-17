package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        String [] mas = new String[8];

        mas[0]="такого дня недели не существует";
        mas[1]="понедельник";
        mas[2]="вторник";
        mas[3]="среда";
        mas[4]="четверг";
        mas[5]="пятница";
        mas[6]="суббота";
        mas[7]="воскресенье";
        boolean bool = false;

        for (int i = 0; i < 8; i++)
        {
            if (n==i && n != 0){
                System.out.println(mas[i]);
                bool = true;
                break;
            }
        }
        if (!bool) System.out.println(mas[0]);






    }
}