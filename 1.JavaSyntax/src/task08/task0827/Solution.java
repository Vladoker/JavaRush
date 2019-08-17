package com.javarush.task.task08.task0827;



/* 
Работа с датой
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        SimpleDateFormat ff = new SimpleDateFormat("D");
        Date dateformat = new Date(date);
       boolean result = Integer.parseInt(ff.format(dateformat)) % 2 == 0 ? false : true;

        return result;//return Integer.parseInt(new SimpleDateFormat("D").format(new Date(date))) % 2 == 0;
    }
}
