package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Томащук","Владислав");
        map.put("Чеботарь","Александр");
        map.put("Вдовиченко","Сергей");
        map.put("Боярский","Евгений");
        map.put("Паскаль","Василий");

        map.put("Михалаки","Сергей");
        map.put("Пукал","Василий");
        map.put("Подубный","Евгений");
        map.put("Прыжков","Александр");
        map.put("Мамаев","Валентин");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        ArrayList<String> list = new ArrayList<>();

        for (Map.Entry<String, String> iter : map.entrySet()){
            String temp = iter.getValue();
            String key = iter.getKey();

            copy.remove(key);
            if (copy.containsValue(temp))list.add(temp);


        }
        for (String str : list) removeItemFromMapByValue(map, str);




    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

//        HashMap<String, String> map = createMap();
//
//        removeTheFirstNameDuplicates(map);
//
//        for (Map.Entry<String, String> pair : map.entrySet()){
//            System.out.println(pair.getKey() + " - " + pair.getValue());
//        }
    }
}
