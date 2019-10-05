package com.hillel.lesson11.createUser;

import java.util.ArrayList;
import java.util.List;

public class PersonProviderImpl implements IPersonProvider {
    @Override
    public List<Person> getPersonList() {
        List<Person> personList = new ArrayList<>();
        Person person = new Person("jjsda", "sdf", 124);
        personList.add(person);
        return personList ;
    }
}
