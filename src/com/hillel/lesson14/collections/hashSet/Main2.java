package com.hillel.lesson14.collections.hashSet;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Petr", "Pupkin", 22));
        persons.add(new Person("Viktoria", "Zagorodnuk", 18));
        persons.add(new Person("Alex", "Ivanov", 53));
        persons.add(new Person("Alex", "Ivanov", 53));
        System.out.println(persons);

        Person person = new Person("Alex", "Ivanov", 53);

        System.out.println(persons.contains(person));

        Set<Person> set = new TreeSet<>(persons);

        persons = new ArrayList<>(set);

        System.out.println(persons);
    }

}
