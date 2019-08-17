package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int one = Integer.parseInt(reader.readLine()),two= Integer.parseInt(reader.readLine()),three = Integer.parseInt(reader.readLine()),a=0,b=0;

        if (one>0) ++b;
        if (one<0) ++a;

        if (two>0) ++b;
        if (two<0) ++a;

        if (three>0) ++b;
        if (three<0) ++a;
        System.out.println("количество отрицательных чисел: "+ a +"\nколичество положительных чисел: "+ b);
    }
}
