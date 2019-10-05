package com.hillel.lesson14.abstractClassDemo.firstOption;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String surname;
    private String name;


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
