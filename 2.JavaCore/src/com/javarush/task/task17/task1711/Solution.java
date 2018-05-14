package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    // Data Format
    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    static SimpleDateFormat outSimpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        switch (args[0]) {
            case "-c": {
                synchronized (allPeople) {
                    initializePersons(args);
                    break;
                }
            }
            case "-u": {
                synchronized (allPeople) {
                    updatePersons(args);
                    break;
                }
            }
            case "-d": {
                synchronized (allPeople) {
                    deletePersons(args);
                    break;
                }
            }
            case "-i": {
                synchronized (allPeople) {
                    outPersons(args);
                    break;
                }
            }
        }
    }

    private static void initializePersons(String[] args) throws ParseException {
        Date date;
        for (int i = 1 ; i < args.length; i += 3) {
            date = simpleDateFormat.parse(args[i + 2]);
            if (sex(args[i + 1]))
                allPeople.add(Person.createMale(args[i], date));
            else
                allPeople.add(Person.createFemale(args[i], date));
            System.out.println(allPeople.size() - 1);
        }
    }

    private static void updatePersons( String[] args) throws ParseException {
        Date date;
        for (int i = 1 ; i < args.length; i += 4) {
            date = simpleDateFormat.parse(args[i + 3]);
            allPeople.get(getInd(args[i])).setName(args[i + 1]);
            allPeople.get(getInd(args[i])).setBirthDay(date);
            if (sex(args[i + 2]))
                allPeople.get(getInd(args[i])).setSex(Sex.MALE);
            else
                allPeople.get(getInd(args[i])).setSex(Sex.FEMALE);
        }
    }

    private static void deletePersons(String[] args) {
        for (int i = 1; i < args.length; i++) {
            allPeople.get(getInd(args[i])).setName(null);
            allPeople.get(getInd(args[i])).setSex(null);
            allPeople.get(getInd(args[i])).setBirthDay(null);
        }
    }

    private static void outPersons(String[] args) {
        for (int i = 1; i < args.length; i++) {
            System.out.println(allPeople.get(getInd(args[i])).getName() + " "
                    + (allPeople.get(getInd(args[i])).getSex().equals(Sex.MALE) ? "м" : "ж") + " "
                    + outSimpleDateFormat.format(allPeople.get(getInd(args[i])).getBirthDay()));
        }
    }

    private static boolean sex(String sex) {
        return sex.equals("м");
    }

    private static int getInd(String s) {
        return Integer.parseInt(s);
    }
}
