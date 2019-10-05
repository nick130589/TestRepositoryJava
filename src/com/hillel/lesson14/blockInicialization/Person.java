package com.hillel.lesson14.blockInicialization;

import java.util.ArrayList;
import java.util.List;

public class Person{
    private String surname;
    private String name;
    public int getAge() {
        return age;
    }
    private int age;
    static List<String> arrayName;
    private static int sallary;

    public  static class  Adress
    {

    }

    static
    {
        System.out.println("First");
        arrayName  = new ArrayList<>();
        sallary = 50*5;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public Person()
    {
        System.out.println("Second");
    }

    public Person(String name, String surname, int age) {
        System.out.println("Second");
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public List<String> getListName() {
        return arrayName;
    }

    public void addName(String name) {
         arrayName.add(name);
    }
}
