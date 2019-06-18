package com.javarush.task.task18.task1814;

public class UnsupportedFileNameException extends Exception {
    public UnsupportedFileNameException(){
        System.out.println("Ошибка файл не .txt");
    }
}
