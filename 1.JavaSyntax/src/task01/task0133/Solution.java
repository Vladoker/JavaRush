package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

public class Solution {

    public static void main(String[] args) {
        int secondsAfter15 = 60*30;
        if(secondsAfter15 % 60 == 0) {
            System.out.println(secondsAfter15);
        }
    }
}