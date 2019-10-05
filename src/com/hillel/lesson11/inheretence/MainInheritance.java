package com.hillel.lesson11.inheretence;

public class MainInheritance {

    public static void main(String[] args) {

        Student studentPetya = new Student("Pety", 21,
                300, "AT-07");


        Student.Address address = new Student.Address(21,
                "Баумана");

        System.out.println(address.toString());

        studentPetya.setAddress(address);

        System.out.println(studentPetya.toString());

    }
}
