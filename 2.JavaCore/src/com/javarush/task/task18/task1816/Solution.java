package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.BufferedInputStream;
import java.io.FileInputStream;


public class Solution {
    public static void main(String[] args) {
        int count = 0;
        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(args.toString()))) {
            int b = -1;

            while ((b = bufferedInputStream.read()) != -1){
                if (b >= 65 && b <= 90 || b >= 97 && b <= 122) ++count;
            }
            System.out.println(count);
        }
        catch (Exception ex){

        }
    }
}
