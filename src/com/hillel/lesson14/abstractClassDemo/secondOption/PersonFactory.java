package com.hillel.lesson14.abstractClassDemo.secondOption;

import java.util.Random;

public class PersonFactory {

    public static Person creationPerson(IPersonGenerationStratagy stratagy)
    {
        return stratagy.generatePerson();
    }


}
