package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";

    FileOutputStream fileOutputStream;

    public AmigoOutputStream(FileOutputStream fileOutputStream) throws FileNotFoundException {
        super(String.valueOf(fileOutputStream));
        this.fileOutputStream = fileOutputStream;
    }




    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }



    public void close() throws IOException {
        byte[] b = "JavaRush © All rights reserved.".getBytes();
        flush();
        write(b);
        fileOutputStream.close();

    }

    public void flush() throws IOException {
        fileOutputStream.flush();
    }

    public void write(byte[] b) throws IOException {
        fileOutputStream.write(b);
    }
    public void write(int b) throws IOException {
        fileOutputStream.write(b);
    }
    public void write(byte[] b, int off, int len) throws IOException {
        fileOutputStream.write(b,off,len);
    }

}
