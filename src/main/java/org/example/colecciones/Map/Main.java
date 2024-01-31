package org.example.colecciones.Map;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String,Integer> preciosMap = new HashMap<>();

        preciosMap.put("Naranjas",3);
        preciosMap.put("Platanos",2);
        preciosMap.put("Mango",6);
        preciosMap.put("Kiwi",6);

        System.out.println(preciosMap);

//        preciosMap.put("Naranjas",5);

        System.out.println("Naranjas: " + preciosMap.get("Naranjas"));

        System.out.println(preciosMap.keySet());
        System.out.println(preciosMap.values());

        for(String key : preciosMap.keySet())
            System.out.println("Key: " + key+ ", Value: " + preciosMap.get(key));

        for(String key : preciosMap.keySet())
            System.out.println(key);

        for(Integer value : preciosMap.values())
            System.out.println(value);




    }
}
