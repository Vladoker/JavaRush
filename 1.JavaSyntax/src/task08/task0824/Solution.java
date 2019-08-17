package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> childs = new ArrayList<>();
       childs.add(new Human("Артём",true,12));
       childs.add(new Human("Ксюша",false,10));
       childs.add(new Human("Саша",true,11));


        ArrayList<Human> parents = new ArrayList<>();
        parents.add(new Human("Владик",true,23, childs));
        parents.add(new Human("Оксана",false,25, childs));//14448

        ArrayList<Human> relatives1 = new ArrayList<>();
        relatives1.add(new Human("Мирослав",true,42,parents.get(0)));
        relatives1.add(new Human("Надежда",false,40,parents.get(0)));


        ArrayList<Human> relatives2 = new ArrayList<>();
        relatives2.add(new Human("Ярослав",true,44,parents.get(1)));
        relatives2.add(new Human("Елена",false,43,parents.get(1)));



       for (Human human : relatives1) System.out.println(human.toString());
       for (Human human : relatives2) System.out.println(human.toString());

       for (Human human : parents) System.out.println(human.toString());
       for (Human human : childs) System.out.println(human.toString());



    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String n, boolean s, int a)
        {
            name = n;
            sex = s;
            age = a;
            children = new ArrayList<Human>(0);
        }
        public Human(String n, boolean s, int a, ArrayList<Human> child)
        {
            name = n;
            sex = s;
            age = a;
            children = child;

        }
        public Human(String n, boolean s, int a, Human child)
        {
            name = n;
            sex = s;
            age = a;
            children = new ArrayList<Human>();
            children.add(child);

        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
