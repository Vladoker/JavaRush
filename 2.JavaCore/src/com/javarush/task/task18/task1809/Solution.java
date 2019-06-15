package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(reader.readLine()));
            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(reader.readLine()));

            ArrayList<Byte> list = new ArrayList<Byte>();

            int b = -1;

            while ((b = inputStream.read()) != -1){
                list.add((byte) b);
            }
        for (int i = list.size()-1; i >= 0; i--) {
            outputStream.write(list.get(i));
        }

            reader.close();
            inputStream.close();
            outputStream.close();



    }
}
