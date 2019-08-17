package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
       Man man1 = new Man("Владислав",25,"Буюканы");
       Man man2 = new Man("Валентин",25,"Ботаника");

       Woman woman1 = new Woman("Оксана",26,"Буюканы");
       Woman woman2 = new Woman("Наташа",30,"Центр");

        man1.Show();
        man2.Show();
        woman1.Show();
        woman2.Show();

    }

   public static class Man
   {
       String name;
       int age;
       String address;

       public Man(String name,int age,String address)
       {
           this.name = name;
           this.age = age;
           this.address = address;
       }

       public void Show()
       {
           System.out.println(name + " " + age + " " + address);
       }
   }
    public static class Woman
    {
        String name;
        int age;
        String address;

        public Woman(String name,int age,String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public void Show()
        {
            System.out.println(name + " " + age + " " + address);
        }
    }
}
