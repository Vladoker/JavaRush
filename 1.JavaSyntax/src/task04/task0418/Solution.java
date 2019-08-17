package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(r.readLine()),b = Integer.parseInt(r.readLine());

        System.out.println(a<=b?a:b);

    }
}