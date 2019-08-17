package com.javarush.task.task05.task0518;

/* 
Регистрируем собачек
*/


public class Dog {
    String name;
    int height;
    String color;

    public Dog(String n)
    {
        name = n;
        height = 1;
        color = "Black";
    }
    public Dog(String n,int h)
    {
        name = n;
        height = h;
        color = "Black";
    }
    public Dog(String n,int h,String c)
    {
        name = n;
        height = h;
        color = c;
    }

    public static void main(String[] args) {

    }
}
