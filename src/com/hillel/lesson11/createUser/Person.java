package com.hillel.lesson11.createUser;

public class Person {
    private String surname;
    private String name;

    public int getAge() {
        return age;
    }

    private int age;


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", named='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
