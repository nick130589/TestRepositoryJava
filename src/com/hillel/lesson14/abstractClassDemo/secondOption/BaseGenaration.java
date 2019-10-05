package com.hillel.lesson14.abstractClassDemo.secondOption;

import java.util.Random;

public abstract class BaseGenaration {

    private Random random = new Random();

    protected String getFirstName(String[] firstName)
    {
        return firstName[random.nextInt(firstName.length)];
    }

    protected String getLastName(String[] lastName)
    {
        return lastName[random.nextInt(lastName.length)];
    }

    protected abstract int height();
}
