package com.javarush.task.task18.task1826;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;


        /*
        Шифровка
        */

public class Solution {
    public static void main(String[] args) {
        if (args.length == 3) {
            try (BufferedInputStream input = new BufferedInputStream(new FileInputStream(args[1]));
                 BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(args[2]))) {
                if (args[0].equals("-e")) {
                    int b;
                    while ((b = input.read()) != -1) {
                        output.write(b + 5);
                    }
                } else if (args[0].equals("-d")) {
                    int b;
                    while ((b = input.read()) != -1) {
                        output.write(b - 5);
                    }
                } else {

                }

            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        else System.out.println("lenght != 3");

    }

}