package com.javarush.task.task18.task1825;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> parts = new ArrayList<String>();
        FileInputStream fileInputStream = null;
        String nextFileName = null;

        while (true) {
            if ("end".equals(nextFileName = scanner.nextLine())) break;
            else parts.add(nextFileName);
        }
        scanner.close();

        Collections.sort(parts, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });

        String outputFileName = parts.get(0).split(".part")[0];
        FileOutputStream fileOutputStream = new FileOutputStream(outputFileName);

        for (String partsFileNames : parts) {
            fileInputStream = new FileInputStream(partsFileNames);
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
            fileOutputStream.write(buffer);
            fileInputStream.close();
        }
        fileOutputStream.close();
    }

    public static void Varian1(){
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            File path = null;
            ArrayList<File> list = new ArrayList<>();

            while (!(path = new File(reader.readLine())).getName().equals("end")){
                list.add(path);
            }

            list.sort((o1, o2) -> {
                String s1 =  o1.getName().replaceAll("[^-?0-9]+","");
                String s2 =  o2.getName().replaceAll("[^-?0-9]+", "");
                if (Integer.parseInt(s1) > Integer.parseInt(s2)) return 1;
                else if(Integer.parseInt(s1) < Integer.parseInt(s2)) return -1;
                return 0;
            });

            String[] str = list.get(0).getName().split("\\.");
            String newPath = "";
            int i = 0;
            for (String s : str){
                if (!s.contains("part")){
                    newPath += ( ++i == 1 ) ? s : "." + s; // для того что бы точку не ставить в начале названия
                }
            }

            newPath = list.get(0).getParent() + "\\" + newPath;


            for (File f : list) {
                try(BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(newPath,true));
                    BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(f))) {

                    int b;
                    while ((b = inputStream.read()) != -1) {
                        outputStream.write(b);
                    }
                    outputStream.flush();
                }
                catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        }

        catch (Exception ex){

        }
    }


}
