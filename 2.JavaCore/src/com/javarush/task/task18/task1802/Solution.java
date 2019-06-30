package com.javarush.task.task18.task1802;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            BufferedInputStream file = new BufferedInputStream(new FileInputStream(reader.readLine()),200);

            int i,min = 0;
            boolean flag = true;

            while((i = file.read()) != -1) {
                if (flag) { min = i; flag = false;}
                if (i < min)min = i;
            }
            System.out.println((byte)min);
            file.close();
        }
        catch (Exception ex){

        }
    }
}
