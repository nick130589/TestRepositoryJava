package com.hillel.lesson11.createUser;

import java.util.Comparator;

public class PersonComporator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
