package com.javarush.task.task18.task1823;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            String name;

            while (true){
                name = reader.readLine();
                if(name.equals("exit")){
                   break;
                }
                new ReadThread(name).start();
            }


        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }

    public static class ReadThread extends Thread {
        String FileName;

        public ReadThread(String fileName) {
            //implement constructor body
            FileName = fileName;
        }


        public void run() {
            try(BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(FileName)))
            {
                int[] mas = new int[256];
                int b;


                while ((b = inputStream.read()) != -1){
                    mas[b]++;
                }
                int max = mas[0];
                int index = 0;
                for (int i = 1; i < mas.length; i++) {
                    if (mas[i] > max) {
                        max = mas[i];
                        index = i;
                    }
                }
                resultMap.put(FileName,index);
            }
            catch (Exception ex){

            }
        }
    }
}
