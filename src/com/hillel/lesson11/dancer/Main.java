package com.hillel.lesson11.dancer;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Dancer dancer = new Dancer("ALEX",19 );
        dancer.setName("Вася");
        dancer.name = "Петя";
        System.out.println("Имя: " + dancer.getName());

        System.out.println("Возраст: " + dancer.getAge());

        Dancer breakDanceDancer = new BreakDankDancer("Алексей", 19);// восходящее преобразование к базовому типу
        Dancer electricBoogieDancer = new ElectricBoogieDancer("Игорь", 20); // восходящее преобразование к базовому типу
        List<Dancer> discotheque = Arrays.asList(
                dancer, breakDanceDancer, electricBoogieDancer);
        for (Dancer d : discotheque) {
            d.dance();// полиморфный вызов метода
        }
    }
}