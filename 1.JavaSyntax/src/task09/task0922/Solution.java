package com.javarush.task.task09.task0922;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

        String d = reader.readLine();

        Date date = new Date();



        System.out.println(formatter.format(formatter2.parse(d)).toUpperCase());

        ////System.out.println(new SimpleDateFormat("MMM d, y", Locale.ENGLISH).format(new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(new BufferedReader(new InputStreamReader(System.in)).readLine())).toUpperCase());


    }
}
