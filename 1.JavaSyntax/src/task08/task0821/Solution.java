package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<>();
        map.put("Томащук", "Владислав");
        map.put("Михалаки", "Сергей");
        map.put("Кудряшёв", "Андрей");
        map.put("Паскаль", "Василий");
        map.put("Устюгов", "Валентин");

        map.put("Полищук", "Владислав");
        map.put("Малахов", "Александр");
        map.put("Пукал", "Василий");
        map.put("Бодруг", "Андрей");
        map.put("Томащук", "Ярослав");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
