package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

import static com.javarush.task.task16.task1631.common.ImageTypes.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes type){


         if (type == BMP) return new BmpReader();
        else if (type == PNG) return new PngReader();
        else if (type == JPG) return new JpgReader();
        else throw new IllegalArgumentException("Неизвестный тип картинки");


    }
}
