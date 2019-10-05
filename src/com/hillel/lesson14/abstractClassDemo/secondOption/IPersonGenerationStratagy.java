package com.hillel.lesson14.abstractClassDemo.secondOption;

public interface IPersonGenerationStratagy<T extends Person> {
    T generatePerson();
}
