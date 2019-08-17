package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       String Path = reader.readLine();

       try {
           FileInputStream fileInputStream = new FileInputStream(Path);
           int r = -1;
           while ((r = fileInputStream.read()) != -1){
               System.out.print((char)r);
           }
           fileInputStream.close();
           reader.close();
       }
       catch (Exception ex){
           System.out.println(ex);
       }


    }
}