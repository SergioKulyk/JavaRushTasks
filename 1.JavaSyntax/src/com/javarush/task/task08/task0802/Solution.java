package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[][] tmpPlant = {{"арбуз","ягода,"},
                {"банан", "трава"},
                {"вишня", "ягода"},
                {"груша", "фрукт"},
                {"дыня", "овощ"},
                {"ежевика", "куст"},
                {"жень-шень", "корень"},
                {"земляника", "ягода"},
                {"ирис", "цветок"},
                {"картофель", "клубень"}};

        HashMap<String, String> plant = new HashMap<String, String>();

        for (int i = 0; i < tmpPlant.length; i++)
            plant.put(tmpPlant[i][0], tmpPlant[i][1]);

        Iterator<Map.Entry<String, String>> iterator = plant.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
