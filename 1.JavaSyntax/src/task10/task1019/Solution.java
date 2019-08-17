package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<>();

        String Key,Value;

        while (true)
        {

            Key = reader.readLine();
            if (Key.isEmpty())break;
            Value = reader.readLine();
            if (Value.isEmpty())break;
            map.put(Value, Integer.parseInt(Key));
        }

        for (HashMap.Entry item: map.entrySet())  System.out.println(item.getValue() + " " + item.getKey());
        System.out.println(Integer.parseInt(Key));




    }
}
