package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> mas = new ArrayList<>();

        ArrayList<Integer> mas1 = new ArrayList<>();
        ArrayList<Integer> mas2 = new ArrayList<>();
        ArrayList<Integer> mas3 = new ArrayList<>();

        for (int i = 0; i < 20; i++) mas.add(Integer.parseInt(reader.readLine()));

        for (int iter : mas) {
            if(iter % 3 == 0)mas1.add(iter);
            if(iter % 2 == 0)mas2.add(iter);
            if(iter % 2 != 0 && iter % 3 != 0)mas3.add(iter);

        }

        printList(mas1);
        printList(mas2);
        printList(mas3);

    }

    public static void printList(List<Integer> list) {
        for (int i : list) {
            System.out.println(i);
        }
    }
}
