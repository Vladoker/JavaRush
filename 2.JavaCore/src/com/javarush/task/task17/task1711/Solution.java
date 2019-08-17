package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        DeletionPerson(new String[]{"-d","1"});
        switch (args[0]){
            case "-i" :
                synchronized (allPeople){
                    show(args);
                    break;
                }
            case "-c" :
                synchronized (allPeople){
                    CreatPerson(args);
                    break;
                }
            case "-u" :
                synchronized (allPeople){
                    UpdatesPerson(args);
                    break;
                }
            case "-d" :
                synchronized (allPeople){
                    DeletionPerson(args);
                    break;
                }

        }

    }

    public static void CreatPerson(String[] args) throws ParseException {
        int count = args.length -1;

        if (count >= 3){
            Date format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3]);
            if (args[2].equals("м")) allPeople.add(Person.createMale(args[1],format));
            else allPeople.add(Person.createFemale(args[1],format));
            System.out.println(allPeople.size() -1);
            count -= 3;
        }


       for (int i = 4;count > 0;){
           Date format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i+2]);
           if (args[i+1].equals("м")) allPeople.add(Person.createMale(args[i],format));
           else allPeople.add(Person.createFemale(args[i],format));
           System.out.println(allPeople.size() -1);
           i += 3;
           count -= 3;
       }
    }

    public static void UpdatesPerson(String[] args) throws ParseException{
        int count = args.length -1;

        if (count >= 4){
            Date format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[4]);
            Person  person = allPeople.get(Integer.parseInt(args[1]));
                 person.setName(args[2]);
                 person.setSex(args[3].equals("м") ? Sex.MALE : Sex.FEMALE);
                 person.setBirthDate(format);
            count -= 4;
        }

        for (int i = 5;count > 0;){
            Date format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i+3]);
            Person person = allPeople.get(Integer.parseInt(args[i]));
                person.setName(args[i+1]);
                person.setSex(args[i+2].equals("м") ? Sex.MALE : Sex.FEMALE);
                person.setBirthDate(format);
            i += 4;
            count -= 4;
        }
    }

    public static void DeletionPerson(String[] args){
         int count = args.length -1; // удаляем '-d' элемент

        for (int i = 1; i <= count; i++) {
            Person person = allPeople.get(Integer.parseInt(args[i]));
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);
        }

    }
    public static void show(String[] args){
        String[] copy = Arrays.copyOfRange(args,1,args.length);
       ArrayList<String> copyArgs = new ArrayList<>(Arrays.asList(copy));
        String data;
        while(copyArgs.size()>0){
            data=copyArgs.get(0);
            copyArgs.remove(0);

            SimpleDateFormat simpledatafo = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            int i = Integer.parseInt(data);
            Person person = allPeople.get(i);
            Date newDate = person.getBirthDate();
            String expectedDate= simpledatafo.format(newDate);
            if (person.getSex().equals(Sex.MALE)) System.out.println(person.getName() +" м "+expectedDate);
            else if (person.getSex().equals(Sex.FEMALE)) System.out.println(person.getName() +" ж "+expectedDate);
        }
    }

    public static void ShowPerson(String[] args){


        for (int i = 1; i <= allPeople.size(); i++) {
            try {
                Person person = allPeople.get(Integer.parseInt(args[i]));
                System.out.println(person.getName() + (person.getSex().equals(Sex.MALE)?" м ":" ж ") + new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(person.getBirthDate()));
            }
            catch (Exception ex){
                continue;
            }

        }

    }




}
