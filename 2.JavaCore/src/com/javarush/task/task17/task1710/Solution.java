package com.javarush.task.task17.task1710;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {

        switch (args[0]) {
            case "-c":
                creatPerson(args[1], args[2], args[3]);
                break;
            case "-u":
                updatePerson(args[1], args[2], args[3], args[4]);
                break;
            case "-d":
                deletePerson(args[1]);
                break;
            case "-i":
                printPerson(args[1]);
                break;
        }
    }

    public static void creatPerson(String name, String sex, String date) throws ParseException {
        Date newInDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(date);

        if (sex.equals("м")) allPeople.add(Person.createMale(name, newInDate));
        else allPeople.add(Person.createFemale(name, newInDate));

        System.out.println(allPeople.size() - 1);
    }

    public static void updatePerson(String id, String name, String sex, String date) throws ParseException {
        Date newInDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(date);

        Person updatingPerson = allPeople.get(Integer.parseInt(id));
        updatingPerson.setName(name);
        updatingPerson.setBirthDate(newInDate);

        if (sex.equals("м")) updatingPerson.setSex(Sex.MALE);
        else updatingPerson.setSex(Sex.FEMALE);

    }

    public static void deletePerson(String id) {
        Person person = allPeople.get(Integer.parseInt(id));
        person.setName(null);
        person.setSex(null);
        person.setBirthDate(null);
    }

    public static void printPerson(String id) {

        System.out.println(allPeople.get(Integer.parseInt(id))); // метод toString переопределен в классе Person

        //в Person
//        public String toString() {
//            SimpleDateFormat date = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
//            String print = null;
//            if (getSex().equals(Sex.MALE)) print = name + " м " + date.format(birthDate);
//            else  print = name + " ж " + date.format(birthDate);
//            return print;
//        }

    }

}

