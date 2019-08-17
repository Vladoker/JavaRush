package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try (FileInputStream fileInputStream = new FileInputStream(reader.readLine()))
        {
            List<Integer> arraylist = new ArrayList<Integer>();

            int buf = -1;
            char ch;
            String str = "";
            while ((buf = fileInputStream.read()) != -1)
            {
               ch = (char)buf;
               if (ch != '\n' && ch != '\r' && ch != ' ')
               {
                   str += ch;
               }
               else {
                  if (!str.equals("")) arraylist.add(Integer.parseInt(str));
                   str = "";
               }
            }
            if (!arraylist.get(arraylist.size() - 1).toString().equals(str) && !str.equals("")) arraylist.add(Integer.parseInt(str));
            Collections.sort(arraylist);

            for (int i:arraylist) {
                if (i %2 == 0)
                System.out.println(i);
            }

            if (fileInputStream != null)
                fileInputStream.close();
                reader.close();
        }
        catch (Exception ex)
        {

            reader.close();
            System.out.println(ex);
        }
    }
}
