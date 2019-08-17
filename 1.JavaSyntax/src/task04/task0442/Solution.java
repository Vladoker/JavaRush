package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum=0;
        int user;

        while (true)
        {
            user = Integer.parseInt(reader.readLine());
            sum += user;
            if (user == -1)break;
        }
        System.out.println(sum);
    }
}
