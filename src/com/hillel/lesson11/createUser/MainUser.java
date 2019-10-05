package com.hillel.lesson11.createUser;

import java.util.*;

public class MainUser {

    public static void main(String[] args) {
        Person person1 = new Person("Alex", "Golovach", 21);
        Person person2 = new Person("Ivan", "Arkashkin", 80);
        Person person3 = new Person("Boris", "Filatov", 50);
        List<Person> personList = new LinkedList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        System.out.println("Before sort: " + personList);
        PersonComporator personComporator = new PersonComporator();

        Collections.sort(personList, personComporator);

        System.out.println("========================================");

        System.out.println("After sort: " + personList);


        IPersonProvider personProvider = new PersonProviderImpl();
        System.out.println(personProvider.getPersonList());
        IPersonProvider personProvider1 = new PersonProviderFromDB();
        personProvider1.getPersonList();
    }

    public static void  addPerson(List<Person> personList)
    {
    }
}
