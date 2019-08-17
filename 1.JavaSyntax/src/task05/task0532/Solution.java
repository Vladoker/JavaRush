package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int maximum=-2147483648;

        int n = N;
        for (int i = 0; i < n ; i++) {
            N = Integer.parseInt(reader.readLine());
            if(N>maximum)maximum=N;
        }

        System.out.println(maximum);
    }
}
