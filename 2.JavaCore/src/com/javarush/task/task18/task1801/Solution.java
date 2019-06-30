package com.javarush.task.task18.task1801;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;


/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            BufferedInputStream file = new BufferedInputStream(new FileInputStream(reader.readLine()),200);

            int i,max = 0;

            while((i = file.read()) != -1) {
                if (max < i)max = i;
            }
            System.out.println((byte)max);
            file.close();
        }
        catch (Exception ex){

        }
    }
}
