package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();



        for (int i = 0; i < 10; i++)  list.add(Integer.parseInt(reader.readLine()));//2, 4, 4, 4, 8, 8, 4, 12, 12, 14


        int max = 1, count = 1;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(i + 1 < list.size()?list.get(i + 1):null))
            {
                ++count;
                if (max < count) max = count;
            }
            else count = 1;
        }

        System.out.println(max);

    }
}