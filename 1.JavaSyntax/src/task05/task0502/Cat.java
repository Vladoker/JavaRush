package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat(){

    }

    public Cat(int age,int weight,int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Cat anotherCat) {
        return this.strength + this.weight + this.age>anotherCat.strength+anotherCat.weight+anotherCat.age;
    }

    public static void main(String[] args) {

        Cat cat1 = new Cat(3,4,6);
        Cat cat2 = new Cat(2,6,3);
        Cat cat3 = new Cat(1,4,2);

        System.out.println(cat2.fight(cat1));


    }
}
