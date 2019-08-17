package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

       int one = Integer.parseInt(r.readLine()),two = Integer.parseInt(r.readLine()),three =Integer.parseInt(r.readLine());

       int min = one<=two?one<=three?one:three:two<=three?two:three;
       int max = one>=two?one>=three?one:three:two>=three?two:three;
       int mean = one + two + three - (max + min);


        System.out.println(max+" "+mean+" "+min);


    }
}
