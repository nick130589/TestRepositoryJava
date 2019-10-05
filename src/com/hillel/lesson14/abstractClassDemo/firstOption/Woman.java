package com.hillel.lesson14.abstractClassDemo.firstOption;

public class Woman extends Person {
    protected static String[] firstName = {"Olga", "Svetlana", "Polina"};
    protected static String[] lastName = {"Sverslova", "Ivanova", "Petrova"};

    public Woman(String name, String surname) {
        super(name, surname);
    }
}
