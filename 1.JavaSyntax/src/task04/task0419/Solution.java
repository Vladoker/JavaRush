package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));

       int a = Integer.parseInt(reader.readLine()),b=Integer.parseInt(reader.readLine()),c =Integer.parseInt(reader.readLine()) ,d=Integer.parseInt(reader.readLine()) ;

        System.out.println((a>=b)?(a>=c)?(a>=d?a:d):(c>=d)?c:d:(b>=c)?(b>=d?b:d):(c>=d?c:d));
    }
}
