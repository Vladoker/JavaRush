package com.javarush.task.task18.task1812;

import java.io.*;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    AmigoOutputStream obj;

    public QuestionFileOutputStream(AmigoOutputStream obj){
        this.obj = obj;
    }

    @Override
    public void flush() throws IOException {
        obj.flush();
    }

    @Override
    public void write(int b) throws IOException {
        obj.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        obj.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        obj.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        String user = reader.readLine();
        if (user.equals("Д")){
            obj.close();
            reader.close();
        }
    }
}

