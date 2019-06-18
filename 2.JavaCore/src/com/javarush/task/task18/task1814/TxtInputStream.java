package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.Pattern;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {

        super(fileName);

        if(!Pattern.matches(".+?\\.txt$",fileName)) {
            super.close();
            throw new UnsupportedFileNameException();
        }


    }

    public static void main(String[] args) throws IOException, UnsupportedFileNameException {

//        TxtInputStream f = new TxtInputStream("E:/test/file.html");
//
//        int b = -1;
//        while((b = f.read()) != -1){
//            System.out.print((char)b);
//        }
    }
}

