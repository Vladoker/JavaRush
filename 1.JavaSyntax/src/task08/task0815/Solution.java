package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();

        map.put("Чеботарь", "Игорь");
        map.put("Томащук", "Владислав");
        map.put("Иванов", "Александр");
        map.put("Соколов", "Денис");
        map.put("Смирнов", "Валерий");
        map.put("Сидоров", "Мирослав");
        map.put("Аблепихов", "Александр");
        map.put("Пукин", "Артём");
        map.put("Равлюк", "Настя");
        map.put("Жидов", "Витя");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;

        if (map.containsValue(name))

            for (Map.Entry<String, String> iter : map.entrySet())
                if (iter.getValue().contains(name)) ++count;


        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        return map.containsKey(lastName) ? 1 : 0;

    }

    public static void main(String[] args) {

    }
}
