package com.hillel.lesson14.abstractClassDemo.secondOption;

public class WomanGeneration extends BaseGenaration implements IPersonGenerationStratagy<Woman> {
    private String[] firstName = {"Olga", "Svetlana", "Polina"};
    private String[] lastName = {"Sverslova", "Ivanova", "Petrova"};

    @Override
    protected int height() {
        return 0;
    }

    @Override
    public Woman generatePerson() {
        return new Woman(getFirstName(firstName), getLastName(lastName));
    }
}
