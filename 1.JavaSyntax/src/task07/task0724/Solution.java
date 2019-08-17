package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human Vlad = new Human("Vlad",true,24);
        Human Vadim = new Human("Vadim",true,20);
        Human Nastea = new Human("Nastea",false,22);
        Human Vika = new Human("Vika",false,26);
        Human Oxana = new Human("Oxana",false,25,Vlad,Vadim);
        Human Ksiu = new Human("Ksiu",false,23,Vika,Nastea);
        Human Marina = new Human("Marina",false,28,Nastea,Ksiu);
        Human Ala = new Human("Ala",false,30,Vadim,Ksiu);
        Human Masa = new Human("Masa",false,19,Vlad,Oxana);


        System.out.println(Vlad.toString());
        System.out.println(Vadim.toString());
        System.out.println(Nastea.toString());
        System.out.println(Vika.toString());
        System.out.println(Oxana.toString());
        System.out.println(Ksiu.toString());
        System.out.println(Marina.toString());
        System.out.println(Ala.toString());
        System.out.println(Masa.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}