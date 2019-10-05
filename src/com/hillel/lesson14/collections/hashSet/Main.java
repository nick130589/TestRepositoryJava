package com.hillel.lesson14.collections.hashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Person> persons = new TreeSet<>();
        persons.add(new Person("Petr", "Pupkin", 22));
        persons.add(new Person("Viktoria", "Zagorodnuk", 18));
        persons.add(new Person("Alex", "Ivanov", 53));
        persons.add(new Person("Alex", "Ivanov", 53));
        System.out.println(persons);
    }

}
