package com.javarush.task.task26.task2603;

import java.util.Comparator;

/*
Убежденному убеждать других не трудно
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class CustomizedComparator<T> implements Comparator<T>{
        private Comparator<T>[] comparators;

        @SafeVarargs
        public CustomizedComparator(Comparator<T>... vararg) {
            this.comparators = vararg;
        }

        @Override
        public int compare(Object o1, Object o2) {
            int comp = 0;
            for (Comparator comparator : comparators) {
                comp = comparator.compare(o1, o2);
                if (comp != 0)
                    return comp;
            }

            return comp;
        }
    }
}
