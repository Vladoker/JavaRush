package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfather = reader.readLine();
        Cat catgranf = new Cat(grandfather);

        String grandmother = reader.readLine();
        Cat catgrandmother = new Cat(grandmother);

        String Dad = reader.readLine();
        Cat catDad = new Cat(Dad, null,catgranf);

        String mother = reader.readLine();
        Cat catMother = new Cat(mother,catgrandmother);

        String son = reader.readLine();
        Cat catson = new Cat(son,catMother,catDad);

        String sister = reader.readLine();
        Cat catsister = new Cat(sister,catMother,catDad);


        System.out.println(catgranf);
        System.out.println(catgrandmother);
        System.out.println(catDad);
        System.out.println(catMother);
        System.out.println(catson);
        System.out.println(catsister);

    }

    public static class Cat {
        private String name;
        private Cat parent1;
        private Cat parent2;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent1) {
            this.name = name;
            this.parent1 = parent1;
        }

        Cat(String name, Cat parent1, Cat parent2) {
            this.name = name;
            this.parent1 = parent1;
            this.parent2 = parent2;
        }

        @Override
        public String toString() {
            if (parent1 == null && parent2 == null)
                return "The cat's name is " + name + ", no mother, no father";
            else
                if(parent1 != null && parent2 == null)return "The cat's name is " + name + ", mother is " + parent1.name + ", no father";
                else if(parent1 == null && parent2 != null)return "The cat's name is " + name + ", no mother, father is "+ parent2.name;
                else return "The cat's name is " + name + ", mother is " + parent1.name + ", father is "+ parent2.name;

        }
    }

}
