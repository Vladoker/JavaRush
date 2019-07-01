package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedOutputStream outputStreamOne = new BufferedOutputStream(new FileOutputStream(reader.readLine()));
            BufferedInputStream inputStreamTwo = new BufferedInputStream(new FileInputStream(reader.readLine()));
            BufferedInputStream inputStreamThree = new BufferedInputStream(new FileInputStream(reader.readLine()))
        ){
            int b = -1;

            while((b = inputStreamTwo.read()) != -1){
                outputStreamOne.write(b);
            }
            while ((b = inputStreamThree.read()) != -1){
                outputStreamOne.write(b);
            }

        }
        catch (Exception ex){
            System.out.println("Ошибка");
        }

    }
}
