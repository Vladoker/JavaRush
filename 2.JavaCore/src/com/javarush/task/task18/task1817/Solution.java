package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Solution {
    public static void main(String[] args) {

        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(args[0]))) {

            int space = 0;
            int symbol = 0;

            int b = -1;

            while ((b = bufferedInputStream.read()) != -1){
                if (b == 32){ space++; symbol++; }
                else symbol++;
            }
            double result = Math.round((float) space/symbol*100*100.0)/100.0;

            System.out.println(result);
        }
        catch (Exception ex){

        }
    }
}
