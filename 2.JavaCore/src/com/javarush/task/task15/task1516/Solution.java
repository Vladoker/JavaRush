package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

public class Solution {
    public int intVar = 1;
    public double doubleVar = 1.1;
    public Double DoubleVar = 1.2;
    public boolean booleanVar = true;
    public Object ObjectVar = new String("Строка");
    public Exception ExceptionVar = new ArithmeticException();
    public String StringVar = "Владислав";

    public static void main(String[] args) {
        System.out.println(new Solution().intVar);
        System.out.println(new Solution().doubleVar);
        System.out.println(new Solution().DoubleVar);
        System.out.println(new Solution().booleanVar);
        System.out.println(new Solution().ObjectVar);
        System.out.println(new Solution().ExceptionVar);
        System.out.println(new Solution().StringVar);

    }
}
