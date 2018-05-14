package com.javarush.task.task12.task1224;

/* 
Неведома зверушка
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код
        String check = o.getClass().getSimpleName();
        String output = "хз";
        boolean isCheck = false;

        String[] animalsObj = new String[] { "Cat", "Tiger", "Lion", "Bull", "Pig" };
        String[] animals = new String[] { "Кот", "Тигр", "Лев", "Бык" };

        for (int i = 0; !isCheck &&  i < animalsObj.length - 1; i++) {
            if (animalsObj[i].equals(check)) {
                output = animals[i];
                isCheck = true;
            }
        }

        return output;
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
