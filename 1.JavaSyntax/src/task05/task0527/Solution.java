package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat cat = new Cat("Tom", 80,"Blue");
        Dog dog = new Dog("Dog",100,"Grey");

        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    public static class Dog {
        String name;
        int strenght;
        String color;

        public Dog(String name, int strenght, String color) {
            this.name = name;
            this.strenght = strenght;
            this.color = color;
        }
    }
    public static class Cat {
        String name;
        int height;
        String color;

        public Cat(String name, int height, String color) {
            this.name = name;
            this.height = height;
            this.color = color;
        }
    }


}
