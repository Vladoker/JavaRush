package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> listUpdate = new ArrayList<String>();
        Iterator<String> iter = list.iterator();
        while (iter.hasNext())
        {
            String s = iter.next();
            if(s.length() % 2 == 0)
            {
                listUpdate.add(s + " " + s);

            }
            else {
                listUpdate.add(s + " " + s + " " + s);
            }
        }

        for (int i = 0; i < listUpdate.size(); i++) {
            System.out.println(listUpdate.get(i));
        }
    }
}
