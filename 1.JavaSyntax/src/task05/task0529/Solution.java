package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String user;
        int summa=0;

        while (true)
        {
            user = reader.readLine();

            if(user.equalsIgnoreCase("сумма"))break;

            summa += Integer.parseInt(user);

        }
        System.out.println(summa);
    }
}
