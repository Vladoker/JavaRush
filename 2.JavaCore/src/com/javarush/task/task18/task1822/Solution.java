package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader inputStream = new BufferedReader(new FileReader(reader.readLine()))
        ){
            if (args.length != 0){
                String product;
                while ((product = inputStream.readLine()) != null){
                   String[] mas = product.split(" ");
                    if (mas[0].equals(args[0])){
                        System.out.println(product);
                        break;
                    }
                }
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
