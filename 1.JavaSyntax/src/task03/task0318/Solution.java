package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        int age = Integer.parseInt(reader.readLine());
        String s = reader.readLine();
        System.out.println(s + " захватит мир через "+age+" лет. Му-ха-ха!");
    }
}
