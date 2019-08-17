package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Томащук", df.parse("JUNE 25 1995"));
        map.put("Сидоров", df.parse("FEB 1 1980"));
        map.put("Чеботарь", df.parse("JUNE 1 1980"));
        map.put("Пукал", df.parse("NOV 1 1980"));
        map.put("Равлюк", df.parse("MAY 1 1992"));
        map.put("Соколов", df.parse("JUN 1 1980"));
        map.put("Кудрешов", df.parse("JUL 1 1996"));
        map.put("Иванов", df.parse("DEC 1 1995"));
        map.put("Горобченко", df.parse("APR 1 1980"));

       return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        map.values().removeIf(str -> str.toString().contains("Jul")|| str.toString().contains("Jun")||str.toString().contains("Aug"));

    }

    public static void main(String[] args) {

    }
}
