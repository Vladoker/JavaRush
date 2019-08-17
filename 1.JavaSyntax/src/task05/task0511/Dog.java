package com.javarush.task.task05.task0511;

/* 
Создать класс Dog
*/

public class Dog {
    String name;
    int height;
    String color;

    public void initialize(String name){
        this.name = name;
        this.height = 1;
        this.color = "Black";
    }
    public void initialize(String name,int height){
        this.name = name;
        this.height = height;
        this.color = "Black";
    }
    public void initialize(String name,int height,String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
