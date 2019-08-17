package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Integer> map = new HashMap<>();

        map.put("January".toLowerCase(), 1);
        map.put("February".toLowerCase(), 2);
        map.put("March".toLowerCase(), 3);
        map.put("April".toLowerCase(), 4);
        map.put("May".toLowerCase(), 5);
        map.put("June".toLowerCase(), 6);
        map.put("July".toLowerCase(), 7);
        map.put("August".toLowerCase(), 8);
        map.put("September".toLowerCase(), 9);
        map.put("October".toLowerCase(), 10);
        map.put("November".toLowerCase(), 11);
        map.put("December".toLowerCase(), 12);

        String date = reader.readLine();

       if ( map.containsKey(date.toLowerCase())) System.out.println(date + " is the " + map.get(date.toLowerCase()) + " month");



    }
}
