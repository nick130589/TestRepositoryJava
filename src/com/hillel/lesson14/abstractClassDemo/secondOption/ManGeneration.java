package com.hillel.lesson14.abstractClassDemo.secondOption;

import java.util.Random;

public class ManGeneration extends BaseGenaration implements IPersonGenerationStratagy<Man> {
    private String[] firstName = {"Vasya", "Petya", "Oleg"};
    private String[] lastName = {"Smith", "Ivanov", "Petrov"};

    @Override
    protected int height() {
        return 1;
    }

    @Override
    public Man generatePerson() {
        return new Man(getFirstName(firstName), getLastName(lastName));
    }

    @Override
    public String getFirstName(String[] firstName)
    {
        Random random = new Random();
        return "Man " +firstName[random.nextInt(firstName.length - 1)];
    }
}
