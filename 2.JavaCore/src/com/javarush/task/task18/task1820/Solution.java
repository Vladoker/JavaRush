package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedInputStream inputstream = new BufferedInputStream(new FileInputStream(reader.readLine()));
            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(reader.readLine()))
        ){
            int b = -1;
            ArrayList<Integer> list = new ArrayList<>(inputstream.available());

            while ((b = inputstream.read()) != -1) {
                if (b == 32)continue;
                if (b >= 3.49) {list.add(b);}

            }
        }
        catch (Exception ex){

        }

    }
}
