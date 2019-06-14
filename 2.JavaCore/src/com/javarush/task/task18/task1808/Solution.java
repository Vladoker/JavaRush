package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(reader.readLine()));
            BufferedOutputStream bufferedOutputStream1 = new BufferedOutputStream(new FileOutputStream(reader.readLine()));
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(reader.readLine()));

                int size = bufferedInputStream.available();

                byte[] buff = new byte[size/2];
               bufferedInputStream.read(buff);
               bufferedOutputStream1.write(buff);

               int i = -1;
            while((i = bufferedInputStream.read()) != -1) {
                bufferedOutputStream2.write(i);
            }




            bufferedInputStream.close();
            bufferedOutputStream1.close();
            bufferedOutputStream2.close();

        }
        catch (Exception ex){

        }

    }
}
