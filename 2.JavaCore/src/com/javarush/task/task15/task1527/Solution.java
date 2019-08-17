package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String URL = reader.readLine();
        reader.close();
        String beta1 = new String();
        boolean extracted = false;

        char[] maschar = URL.toCharArray();

        for (int i = 15; i < maschar.length; i++) {
            if (maschar[i] == '?'){
                for (int j = i+1; j < maschar.length; j++) {
                    beta1 += maschar[j];
                }
                extracted = true;
                break;
            }
        }
        if (!extracted){
            for (int i = 0; i < maschar.length; i++) {
                if (maschar[i] == '?'){
                    for (int j = i+1; j < maschar.length; j++) {
                        beta1 += maschar[j];
                    }
                    extracted = true;
                    break;
                }
            }
        }
        if (extracted) {

            String[] beta2 = beta1.split("&");

            for (String str : beta2) {
                if (!str.contains("obj")) {
                    System.out.print(str.split("=")[0] + " ");
                } else System.out.print("obj" + " ");

            }


            try {
                for (String str : beta2) {
                    if (str.contains("obj")){
                        System.out.println();
                        alert(Double.parseDouble(str.substring(str.indexOf('=')+1)));
                    }
                }
            } catch (Exception ex) {
                for (String str : beta2) {
                    if (str.contains("obj")){
                        System.out.println();
                        alert(str.substring(str.indexOf('=')+1));
                    }
                }
            }

        }
        else System.out.println("Данные из сылки не извлечены");


    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
