package com.javarush.task.task12.task1225;

/* 
Посетители
*/
import java.util.ArrayList;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код
        String check = o.getClass().getSimpleName();
        String out = "Животное";
        boolean isCheck = true;
//        I know I`m crazy,
//        Dear creates it`s simple tasks and I wanted to do it so funny through Iterator
//        Maxaxaxaxxax
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Кот");
        animals.add("Тигр");
        animals.add("Лев");
        animals.add("Бык");
        animals.add("Корова");

        ArrayList<String> animalsCheck = new ArrayList<>();
        animalsCheck.add("Cat");
        animalsCheck.add("Tiger");
        animalsCheck.add("Lion");
        animalsCheck.add("Bull");
        animalsCheck.add("Cow");

        for (Iterator<String> iter1 = animalsCheck.iterator(), iter2 = animals.iterator(); iter1.hasNext() && iter2.hasNext();) {
            String i1 = iter1.next();
            String i2 = iter2.next();
            if (i1.equals(check)) {
                out = i2;
                break;
            }
        }

        return out;
    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
