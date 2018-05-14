package com.javarush.task.task13.task1327;

import com.javarush.task.task13.task1327.RepkaItem;

public class Person implements RepkaItem {
    private String name;
    private String namePadezh;

    public Person(String name, String namePadezh) {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    public void pull(Person person) {
        System.out.println(this.name + " за " + person.getNamePadezh());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamePadezh() {
        return namePadezh;
    }

    public String setNamePadezh(String namePadezh) {
        return this.namePadezh = namePadezh;
    }
}
