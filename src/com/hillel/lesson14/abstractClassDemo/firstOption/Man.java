package com.hillel.lesson14.abstractClassDemo.firstOption;

public class Man extends Person {
    protected static String[] firstName = {"Vasya", "Petya", "Oleg"};
    protected static String[] lastName = {"Smith", "Ivanov", "Petrov"};


    public Man(String name, String surname) {
        super(name, surname);
    }
}
