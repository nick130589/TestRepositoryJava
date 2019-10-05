package com.hillel.lesson14.blockInicialization;

public class Main {
    private static Person.Adress adress;
    public static void main(String[] args) {
        Person person = new Person();
        person.addName("Kolya");
        System.out.println(person.getListName());
    }
}
