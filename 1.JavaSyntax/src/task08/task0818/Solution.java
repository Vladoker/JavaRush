package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Томащук", 1000);
        map.put("Пукал", 780);
        map.put("Сальватор", 850);
        map.put("Пупкин", 600);
        map.put("Промитей", 900);

        map.put("Сасковский", 300);
        map.put("Сквепенс", 480);
        map.put("Ельдаров", 320);
        map.put("Кулик", 100);
        map.put("Сарданов", 750);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<>(map);

        for (Map.Entry<String, Integer> iter : copy.entrySet() ){

            if (iter.getValue() < 500)map.remove(iter.getKey());
        }
    }

    public static void main(String[] args) {

    }
}