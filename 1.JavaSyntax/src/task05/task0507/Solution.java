package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int user;
        int count =0;
        int sum=0;

        while (true)
        {
            user = Integer.parseInt(reader.readLine());
            if(user == -1)break;
            else
            {
                sum+=user;
                ++count;
            }
        }
        System.out.println((double)sum/count);
    }
}

