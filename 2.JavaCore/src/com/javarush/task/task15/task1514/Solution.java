package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>(){{
        put(1.80,"Владик");
        put(15.55,"Валик");
        put(1.75,"Серёжа");
        put(1.77,"Андрей");
        put(2.00,"Ваня");
    }};





    public static void main(String[] args) {
        System.out.println(labels);
    }
}
