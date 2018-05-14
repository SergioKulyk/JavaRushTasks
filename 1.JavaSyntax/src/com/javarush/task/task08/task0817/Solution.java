package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        String[][] nameCompl = new String [][] {{"Kulyk", "Sergey"},
                {"Kulik", "Roma"},
                {"Sav", "Bog"},
                {"Hug", "And"},
                {"Reym", "Lid"},
                {"Amj", "Roma"},
                {"Rie", "Serget"},
                {"Bukf", "Kiril"},
                {"Bel", "Nel"},
                {"Iga", "Oa"},
                {"Kiss", "Fm"}};
        for (int i = 0; i < 10; i++)
            map.put(nameCompl[i][0], nameCompl[i][1]);
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> mapNew = new HashMap<>(map);
        int n = 0; // счетчик, он минимум будет равен 1 если нет повторений.
        for (Iterator<Map.Entry<String, String>> iterator1 = mapNew.entrySet().iterator(); iterator1.hasNext();) {
            HashMap.Entry<String, String> pair1 = iterator1.next();
            String value1 = pair1.getValue();
            n = 0;
            for (Iterator<Map.Entry<String, String>> iterator2 = mapNew.entrySet().iterator(); iterator2.hasNext();) {
                HashMap.Entry<String, String> pair2 = iterator2.next();
                String value2 = pair2.getValue();
                if (value1.equals(value2)) n++;
            }
            if (n>1) removeItemFromMapByValue(map, value1); // использую метод для удаления повторяющихся имен
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
