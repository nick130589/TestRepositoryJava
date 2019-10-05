package com.hillel.lesson14.collections.map;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Map<String, Person> map = new HashMap<>();

        map.put("Petya", new Person("Petr", "Pupkin", 22));
        map.put("Alex", new Person("Alex", "Ivanov", 22));
        map.put("Alex2", new Person("Alex", "Zagorodnuk", 22));
        map.put(null, new Person("Denis", "Zagorodnuk", 22));

        System.out.println(map.get("Alex"));


        System.out.println(map.get(2));
    }

}
