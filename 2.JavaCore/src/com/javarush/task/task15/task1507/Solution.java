package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m, double n, String value) {System.out.println((double)m + n + value);}

    public static void printMatrix(double m, int n, String value) {System.out.println(m + (double)n + value);}

    public static void printMatrix(double m, double n, String value) {System.out.println(m + n + value);}

    public static void printMatrix(String str, int m, double n) {System.out.println(str + (double)m + n );}

    public static void printMatrix(String str, double m, int n) {System.out.println(str + m + (double)n );}

    public static void printMatrix(String str, double m, double n) {System.out.println(str + m + n );}

    public static void printMatrix(String str, String m, int n) {System.out.println(str + m + n );}

    public static void printMatrix(String str, String m, String n) {System.out.println(str + m + n );}





}
