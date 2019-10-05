package com.hillel.lesson11.interfaceDemo;

public interface Eat {
    void eat();

    default void eatSomething()
    {
        System.out.println("Я ем");
    }
}
