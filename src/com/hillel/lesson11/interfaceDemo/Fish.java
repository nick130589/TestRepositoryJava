package com.hillel.lesson11.interfaceDemo;

public class Fish implements Swim, Eat {
    private String name;

    public Fish(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("Я рыба " + name + ". Я плыву, двигая плавниками.");
    }

    @Override
    public void eat() {
        System.out.println("Я рыба и я ем");
    }

    @Override
    public void eatSomething() {
        System.out.println("Я ем водоросли");
    }
}
