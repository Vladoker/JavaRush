package com.javarush.task.task18.task1805;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            ArrayList list = new ArrayList();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(reader.readLine()));

            int b = -1;

            while((b = bufferedInputStream.read()) != -1){

                if (!list.contains(b)) {
                    list.add(b);
                }
            }
            bufferedInputStream.close();
            reader.close();
            Collections.sort(list);


            for (Object i : list){
                System.out.print(i + " ");
            }

        } catch (Exception ex) {
        }
    }
}
