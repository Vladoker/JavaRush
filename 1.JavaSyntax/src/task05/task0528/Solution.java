package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/


import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new SimpleDateFormat("dd MM yyyy").format(Calendar.getInstance().getTime()));
    }
}
