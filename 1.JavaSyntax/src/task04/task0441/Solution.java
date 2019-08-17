package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      int a = Integer.parseInt(reader.readLine()),b= Integer.parseInt(reader.readLine()),c= Integer.parseInt(reader.readLine());

      int max = a>=b?a>=c?a:c:b>=c?b:c;
      int min = a<=b?a<=c?a:c:b<=c?b:c;
      int mean = a+b+c -(max+min);
        System.out.println(mean);
    }
}
