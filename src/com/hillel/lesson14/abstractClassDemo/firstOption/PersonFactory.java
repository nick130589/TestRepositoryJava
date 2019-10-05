package com.hillel.lesson14.abstractClassDemo.firstOption;

import java.util.Random;

public class PersonFactory {
    private static Random random = new Random();

    public static Person creationPerson(Class<? extends Person> clazz)
    {
        if (clazz == Man.class)
        {
            return new Man(getFirstName(Man.firstName), getLastName(Man.lastName));
        } else if (clazz == Woman.class)
        {
            return new Woman(getFirstName(Woman.firstName), getLastName(Woman.lastName));
        } else
        {
            throw new RuntimeException("Object is not defined");
        }
    }

    private static String getFirstName(String[] firstName)
    {
        return firstName[random.nextInt(firstName.length)];
    }

    private static String getLastName(String[] lastName)
    {
        return lastName[random.nextInt(lastName.length)];
    }

}
