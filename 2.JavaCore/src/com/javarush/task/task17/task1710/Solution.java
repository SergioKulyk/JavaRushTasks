package com.javarush.task.task17.task1710;

import java.text.DateFormat;
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
        //start here - начни тут
        SimpleDateFormat formatInput = new SimpleDateFormat("dd/MM/yyy", Locale.ENGLISH);
        SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        switch (args[0]) {
            case ("-c"): {
                Date dateFormat = formatInput.parse(args[3]);
                switch (args[2]) {
                    case "м": {
                        allPeople.add(Person.createMale(args[1], dateFormat));
                        break;
                    }
                    case "ж": {
                        allPeople.add(Person.createFemale(args[1], dateFormat));
                        break;
                    }
                }
//                System.out.println(allPeople.size() - 1);
//                System.out.println(format.format(allPeople.get(allPeople.size() - 1).getBirthDay()));
                break;
            }
            case ("-u"): {
                Date dateFormat = formatInput.parse(args[4]);
                int ind = getIndex(args[1]);
                if (isAlive(ind)) {
                    allPeople.get(ind).setName(args[2]);
                    allPeople.get(ind).setBirthDay(dateFormat);
                    if (args[3].equals("м"))
                        allPeople.get(ind).setSex(Sex.MALE);
                    else if (args[3].equals("ж"))
                        allPeople.get(ind).setSex(Sex.FEMALE);
                }
                break;
            }
            case ("-d"): {
                int ind = getIndex(args[1]);
                if (ind >= 0) {
                    if (isAlive(ind)) {
                        allPeople.get(ind).setName(null);
                        allPeople.get(ind).setSex(null);
                        allPeople.get(ind).setBirthDay(null);
                    }
                }
                break;
            }

            case ("-i"): {
                int ind = getIndex(args[1]);
                if (ind >= 0) {
                    Person currentPerson = getPerson(ind);

                    if (isAlive(ind)) {
                        System.out.println(currentPerson.getName() + " "
                                + (currentPerson.getSex().equals(Sex.MALE) ? "м" : "ж")
                                + " " + format.format(currentPerson.getBirthDay()));
                    }
                }
                break;
            }
        }
    }

    private static boolean isAlive(int i) { return i <= allPeople.size(); }
    private static Person getPerson(int i) { return allPeople.get(i); }
    private static int getIndex(String ind) {
        try {
            return Integer.parseInt(ind);
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
