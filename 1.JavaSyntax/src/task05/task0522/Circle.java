package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle(double a,double b,double c)
    {
        x = a;
        y = b;
        radius = c;
    }
    public Circle(double a,double b)
    {
        x = a;
        y = b;
        radius = a + b;
    }
    public Circle(Circle circle)
    {
        x = circle.x;
        y = circle.y;
        radius = circle.radius;
    }
    public Circle()
    {
        x = y = radius = 1;
    }

    public static void main(String[] args) {

    }
}