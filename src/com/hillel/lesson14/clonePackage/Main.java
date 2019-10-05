package com.hillel.lesson14.clonePackage;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("T", "Y", 2);

        Person person2 = (Person) person1.clone();

        Person person3 = new Person(person1);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

    }
}
