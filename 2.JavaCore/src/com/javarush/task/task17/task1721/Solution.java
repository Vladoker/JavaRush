package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            FileRead(reader.readLine(), allLines);
            FileRead(reader.readLine(), forRemoveLines);
            new Solution().joinData();
        }
        catch (Exception ex)
        {

        }


    }

    public void joinData() throws CorruptedDataException {

        for(String str : forRemoveLines){
            if (allLines.contains(str)){
                allLines.remove(str);
            }
            else {
                allLines.clear();
                throw new CorruptedDataException();
            }
        }
    }

    public static void FileRead(String path, List<String> list){
        try(BufferedReader reader = new BufferedReader(new FileReader(path)))
        {
            String line;
                while ((line = reader.readLine()) != null){
                    list.add(line);
                }
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
