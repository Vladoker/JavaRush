package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(reader.readLine()));

            int b = -1;
            int count = 0;

            while ((b = bufferedInputStream.read()) != -1){

                if (b == 44) ++count;
            }

            bufferedInputStream.close();

            System.out.println(count);

        }
        catch (Exception ex){

        }
    }
}
