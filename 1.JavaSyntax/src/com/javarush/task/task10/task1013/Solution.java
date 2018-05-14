package com.javarush.task.task10.task1013;

import java.util.ArrayList;
/* 
Конструкторы класса Human
*/


public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private char sex;
        private String prof;
        private float weight;
        private ArrayList<String> list = new ArrayList<String>();

        // baby
        public Human(String name, float weight, ArrayList<String> list) {

        }

        // small child
        public Human(String name, int age, float weight, ArrayList<String> list) {

        }

        // teeneger
        public Human(String name, int age, float weight, String prof, ArrayList<String> list) {

        }

        // person
        public Human(String name, int age, float weight, String prof) {

        }

        // employ
        public Human(String name, char sex, String prof) {

        }

        // family person
        public Human(String name, char sex) {

        }

        // guest
        public Human(String name) {

        }

        // sport man
        public Human(String name, char sex, int age) {

        }

        // programmer
        public Human(String name, String prof) {

        }

        // old person
        public Human(String name, int age) {

        }
    }
}
