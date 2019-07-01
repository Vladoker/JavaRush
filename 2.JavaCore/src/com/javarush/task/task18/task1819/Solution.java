package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) {


        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String nameFile = reader.readLine();
            BufferedInputStream inputStreamOne = new BufferedInputStream(new FileInputStream(nameFile));
            BufferedInputStream inputStreamTwo = new BufferedInputStream(new FileInputStream(reader.readLine()));
            byte[] buff = new byte[inputStreamOne.available()];
            byte[] buff2 = new byte[inputStreamTwo.available()];

            inputStreamOne.read(buff);
            inputStreamTwo.read(buff2);

            FileOutputStream fileOutputStream = new FileOutputStream(nameFile);

            fileOutputStream.write(buff2);
            fileOutputStream.write(buff);

            fileOutputStream.close();
            inputStreamOne.close();
            inputStreamTwo.close();

        }
        catch (Exception ex){
            System.out.println("Ошибка");
        }


    }
}
