package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String Name;
        private String Surname;
        private boolean Sex;
        private int Age;
        private int Weight;
        private int Height;

       public Human(){Name = "no Name";}
       public Human(String name){Name = name;}
       public Human(String name, String surname){Name = name; Surname = surname;}
       public Human(String name, String surname, boolean s){ Name = name; Surname = surname; Sex = s;}
       public Human(String name, String surname, boolean s, int age){ Name = name; Surname = surname; Sex = s; Age = age;}
       public Human(String name, String surname, boolean s, int age, int weight){ Name = name; Surname = surname; Sex = s; Age = age; Weight = weight;}
       public Human(String name, String surname, boolean s, int age, int weight, int height){ Name = name; Surname = surname; Sex = s; Age = age; Weight = weight; Height = height;}
       public Human(String name, boolean s){Name = name; Sex = s; }
       public Human(String name, int age){Name = name; Age = age; }
       public Human(String name, int weight, int height){Name = name; Weight = weight; Height = height; }
    }

}
