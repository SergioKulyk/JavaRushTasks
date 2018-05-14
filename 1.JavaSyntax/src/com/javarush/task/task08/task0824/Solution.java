package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/
import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human child1 = new Human();
        child1.name = "Gerf";
        child1.age = 12;
        child1.sex = true;

        Human child2 = new Human();
        child2.name = "Merf";
        child2.age = 2;
        child2.sex = false;

        Human child3 = new Human();
        child3.name = "Iki";
        child3.age = 2;
        child3.sex = false;

        Human father = new Human();
        father.name = "Hou";
        father.age = 33;
        father.sex = true;
        father.children.add(child1);
        father.children.add(child2);
        father.children.add(child3);

        Human mother = new Human();
        mother.name = "Mia";
        mother.age = 31;
        mother.sex = false;
        mother.children.add(child1);
        mother.children.add(child2);
        mother.children.add(child3);

        Human grandfather1 = new Human();
        grandfather1.name = "Artur";
        grandfather1.age = 65;
        grandfather1.sex = true;
        grandfather1.children.add(father);

        Human grandfather2 = new Human();
        grandfather2.name = "Mek";
        grandfather2.age = 67;
        grandfather2.sex = true;
        grandfather2.children.add(mother);

        Human grandmother1 = new Human();
        grandmother1.name = "It";
        grandmother1.age = 45;
        grandmother1.sex = false;
        grandmother1.children.add(father);

        Human grandmother2 = new Human();
        grandmother2.name = "Kia";
        grandmother2.age = 55;
        grandmother2.sex = false;
        grandmother2.children.add(mother);

        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        int age;
        boolean sex;
        List<Human> children = new ArrayList<Human>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
