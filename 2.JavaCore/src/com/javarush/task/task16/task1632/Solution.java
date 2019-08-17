package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new First());
        threads.add(new Second());
        threads.add(new Third());
        threads.add(new Fourth());
        threads.add(new Fifth());
    }

    public static void main(String[] args) throws InterruptedException {
        Fourth t = new Fourth();
        t.start();
        Thread.currentThread().sleep(1000);
        t.showWarning();
        Thread.currentThread().sleep(1000);
        System.out.println(t.isAlive());

    }

    public static class First extends Thread {
        public void run(){
            while (true){}
        }
    }
    public static class Second extends Thread {
        public void run(){
           try {
               while (true){Thread.sleep(1);}
           }
           catch (InterruptedException ex){
               System.out.println("InterruptedException");
           }
        }
    }
    public static class Third extends Thread {
        public void run(){
            try {
                while (true){
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            }
            catch (InterruptedException ex){
                System.out.println("InterruptedException");
            }
        }
    }
    public static class Fourth extends Thread implements Message {
       private static volatile boolean stop = true;
        public void run(){
            try {
                while (stop){

                }
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }

        @Override
        public void showWarning() {
            stop = false;
        }
    }
    public static class Fifth extends Thread {
        double sum = 0;
        String bufer;

        public void run(){
            try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                while (!(bufer = reader.readLine()).equals("N")){
                    sum += Double.parseDouble(bufer);
                }
                System.out.println(sum);
            }
            catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}