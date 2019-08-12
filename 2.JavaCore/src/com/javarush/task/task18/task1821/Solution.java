package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Solution {
    public static void main(String[] args) {

        try(BufferedInputStream bufer = new BufferedInputStream(new FileInputStream(args[0]))){
            int[] mas = new int[128];

            int b = -1;

            while((b = bufer.read()) != -1){
                mas[b]++;
            }

            for(int i = 0; i < mas.length;i++) if (mas[i] > 0) System.out.println((char)i + " " + mas[i]);
        }
        catch(Exception ex){

        }

    }
}
