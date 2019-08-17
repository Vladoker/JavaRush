package com.javarush.task.task16.task1618;

/* 
Снова interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
        TestThread testThread = new TestThread();
        testThread.start();
        testThread.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread{



        @Override
        public void run() {
            try {
                System.out.println("Нить TestThread запущена");
                Thread.sleep(1000);
                System.out.println("Нить TestThread завершила свою работу");
            }
            catch (InterruptedException ex){
                System.out.println("Нить TestThread прервана");
            }
        }
    }
}