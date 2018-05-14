package com.javarush.task.task22.task2208;

import java.util.Formatter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
//        Map<String, String> map = new LinkedHashMap<>();
//        map.put("name", null);
//        map.put("country", null);
//        map.put("city", null);
//        map.put("age", null);
//
//        System.out.println(getQuery(map));

    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder stringBuilder = new StringBuilder("");
        String format = "%s = '%s' and ";
        for (Map.Entry<String, String> iter : params.entrySet()) {
            if (iter.getValue() != null)
                stringBuilder.append(String.format(format, iter.getKey(), iter.getValue()));
        }
        try {
            return  stringBuilder.delete(stringBuilder.length() - 5, stringBuilder.length()).toString();
        } catch (IndexOutOfBoundsException e) {
            return "";
        }
    }


}
