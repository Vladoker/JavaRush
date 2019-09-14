package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;


public class Solution {


    public static void main(String[] args) {
        File name = null;

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {


            while (true) {
               try(BufferedInputStream bufer = new BufferedInputStream(new FileInputStream(name = new File(reader.readLine())))) {

               }
               catch (FileNotFoundException ex){
                   System.out.println(name.getPath());
                   break;
               }
            }

        }
        catch (Exception ex){

        }
    }
}
