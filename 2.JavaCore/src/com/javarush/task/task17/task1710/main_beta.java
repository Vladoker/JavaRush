//package com.javarush.task.task17.task1710;
//
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.Locale;
//
///*
//CRUD
//*/
//
//public class Solution {
//    public static List<Person> allPeople = new ArrayList<Person>();
//
//    static {
//        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
//        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
//    }
//
//    public static void main(String[] args) throws IOException {
//        //start here - начни тут
//        SimpleDateFormat dateFormatOut = new SimpleDateFormat("d-MMM-yyyy", Locale.ENGLISH);
//        SimpleDateFormat dateFormatRead = new SimpleDateFormat("dd/MM/yyyy");
//
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        while (true) {
//            String user = reader.readLine();
//            String[] buffer = user.split(" ");
//
//
//
//
//
//            if (buffer[0].equals("-c")) {
//                try {
//                    boolean HaveLastNameCreate = buffer.length == 5;
//                    String nameCreate = HaveLastNameCreate ? buffer[1] + " " + buffer[2] : buffer[1];
//
//                    if (buffer[HaveLastNameCreate?3:2].equals("м"))
//                        allPeople.add(Person.createMale(nameCreate, dateFormatRead.parse(buffer[HaveLastNameCreate?4:3])));
//                    else if (buffer[HaveLastNameCreate?3:2].equals("ж"))
//                        allPeople.add(Person.createFemale(nameCreate, dateFormatRead.parse(buffer[HaveLastNameCreate?4:3])));
//                    System.out.println(allPeople.size()-1);
//
//                } catch (Exception ex) {
//                    System.out.println("Ошибка формата");
//                }
//
//
//            }
//            else if (buffer[0].equals("-i")) {
//
//                try {
//                   Person person = allPeople.get(Integer.parseInt(buffer[1]));
//                    System.out.println(person.getName() + " " + (person.getSex() == Sex.MALE ? "м" : "ж") + " " + dateFormatOut.format(person.getBirthDate()));
//                }
//                catch (Exception ex){
//                   // System.out.println("Нету такого id");
//                }
//            }
//            else if (buffer[0].equals("-d")) {
//                try {
//                    Person person = allPeople.get(Integer.parseInt(buffer[1]));
//                    person.setName(null);
//                    person.setBirthDate(null);
//                    person.setSex(null);
//                }
//                catch (Exception ex){
//                    // System.out.println("Нету такого id");
//                }
//            }
//            else if (buffer[0].equals("-u")) {
//
//                try {
//                    Person person = allPeople.get(Integer.parseInt(buffer[1]));
//                    boolean HaveLastNameUpdate = buffer.length == 6;
//                    String UpdateName = HaveLastNameUpdate ? buffer[2] + " " + buffer[3] : buffer[2];
//                    person.setName(UpdateName);
//                    person.setSex(buffer[HaveLastNameUpdate?4:3].equals("м") ? Sex.MALE : Sex.FEMALE);
//                    person.setBirthDate(dateFormatRead.parse(buffer[buffer.length - 1]));
//                }
//                catch (Exception ex){
//                    // System.out.println("Нету такого id");
//                }
//            }
//            else break;
//
//        }
//        reader.close();
//
//
//    }
//}
