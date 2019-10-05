package com.hillel.lesson11.dancer;

public class Dancer {
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dancer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void dance() {
        System.out.println(toString() + "Я танцую как все.");
    }

    public void dance(String s) {
        System.out.println(toString() + "Я танцую как все.");
    }

    public void dance(String... s) {
        System.out.println(toString() + "Я танцую как все.");
    }

    public void dance(int a, boolean flag) {
        System.out.println(toString() + "Я танцую как все.");
    }

    public void dance(long a, boolean flag) {
        System.out.println(toString() + "Я танцую как все.");
    }

    public void dance(byte a, boolean flag) {
        System.out.println(toString() + "Я танцую как все.");
    }

    @Override
    public String toString() {
        return "Я " + name + ", мне " + age + " лет. ";
    }
}
