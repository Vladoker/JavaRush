package com.javarush.task.task15.task1501;

/* 
ООП - Расставить интерфейсы
*/

public class Solution {
    public static void main(String[] args) {

        Clothes сlothes = new Clothes("верхняя одежа");

        System.out.println(сlothes.getAllowedAction());

    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Movable,Sellable,Discountable {

        private String NameClothes;

        public Clothes(String nameClothes)
        {
            NameClothes = nameClothes;
        }

        @Override
        public boolean isMovable() {
            if (NameClothes.equalsIgnoreCase("Кросовки") || NameClothes.equalsIgnoreCase("Обувь"))return true;
            return false;
        }

        @Override
        public Clothes getAllowedAction(String name) {
            if (name.contentEquals("Верхняя"))return new Clothes("Рубашки");
           else if (name.contentEquals("Нижняя"))return new Clothes("Джинсы");
            return new Clothes("Носки");
        }

        @Override
        public Clothes getAllowedAction() {
            return new Clothes("Футболки");
        }

        public String toString()
        {
            return this.NameClothes;
        }
    }
}
