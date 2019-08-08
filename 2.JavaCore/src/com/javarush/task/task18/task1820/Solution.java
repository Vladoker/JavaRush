package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;

public class Solution  {
    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedInputStream inputstream = new BufferedInputStream(new FileInputStream(reader.readLine()));
            FileWriter fileWriter = new FileWriter(reader.readLine())
        ) {

            StringBuilder builderIn = new StringBuilder(inputstream.available());

            ArrayList<Integer> list = new ArrayList<>(inputstream.available());


            int b = -1;

            while ((b = inputstream.read()) != -1) {
                builderIn.append((char)b);
            }

            String[] digit = builderIn.toString().split(" ");

            for(String s: digit){
                double d = Double.parseDouble(s);
                int convert = (int)Math.round(d);
                String str = convert + " ";

                fileWriter.write(str);
            }
            fileWriter.flush();

        }
        catch (Exception ex){

        }


    }
}
