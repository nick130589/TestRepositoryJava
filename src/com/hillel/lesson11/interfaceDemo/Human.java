package com.hillel.lesson11.interfaceDemo;

public class Human implements Swim {

    private String name;
    private  int age;

    public Human(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println("Я человек и я плаваю с помощью рук и ног");
    }
}
