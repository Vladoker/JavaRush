package com.javarush.task.task13.task1319;

import java.io.*;


/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        String nameFile = reader.readLine();
//        FileOutputStream fileOutputStream = new FileOutputStream(nameFile);
//        String lineSeparator = System.getProperty("line.separator");
//        while (!nameFile.equals("exit"))
//        {
//            nameFile = reader.readLine();
//            fileOutputStream.write(nameFile.getBytes());
//            fileOutputStream.write(lineSeparator.getBytes());
//        }
//        fileOutputStream.close();
//        reader.close();

////////////////////////////////////////////////////////////////////////

        String str = reader.readLine();

//        File file = new File(str);
//        FileWriter fileWriter = new FileWriter(file);
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(str)));

        while (!(str = reader.readLine()).equals("exit"))
        {
            bufferedWriter.write(str);
            bufferedWriter.newLine();
        }
        bufferedWriter.write("exit");
        bufferedWriter.close();



    }
}
