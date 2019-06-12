package com.javarush.task.task18.task1803;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();

            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(reader.readLine()));

            int b = -1;

            while((b = bufferedInputStream.read()) != -1){

                if (map.containsKey(b)) {
                    map.put(b, map.get(b) + 1);
                }
                else map.put(b, 1);
            }
            bufferedInputStream.close();
            reader.close();
            int maxValueInMap = Collections.max(map.values());

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == maxValueInMap) {
                    System.out.print(entry.getKey() + " ");
                }
            }


        } catch (Exception ex) {

        }
    }
}
