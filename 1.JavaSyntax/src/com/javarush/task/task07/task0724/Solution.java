package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human anna = new Human("Anna", false, 99);
        Human katya = new Human("Anna", false, 79);
        Human karian = new Human("Anna", false, 89);
        Human matina = new Human("Anna", false, 109);
        Human andriy = new Human("Andriy", true, 15, anna, katya);
        Human petya = new Human("Petya", true, 15, anna, katya);
        Human sergey = new Human("Sergey", true, 15, karian, matina);
        Human roma = new Human("Roma", true, 15, matina, anna);
        Human bodya = new Human("Bodya", true, 15, karian, katya);

        System.out.println(anna.toString());
        System.out.println(katya.toString());
        System.out.println(karian.toString());
        System.out.println(matina.toString());
        System.out.println(andriy.toString());
        System.out.println(petya.toString());
        System.out.println(sergey.toString());
        System.out.println(roma.toString());
        System.out.println(bodya.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;

        Human father = null;
        Human mother = null;

        Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.father = father;
            this.mother = mother;
        }

        Human(String name, boolean sex, int age) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}

