package com.hillel.lesson11.inheretence;

public class Student extends User {

    private static String lastName = "Pupkin";

    public static class Address {
        private int houseNumber;
        private String streetName;

        public Address(int houseNumber, String streetName) {
            this.houseNumber = houseNumber;
            this.streetName = streetName;
        }

        public int getHouseNumber() {
            return houseNumber;
        }

        public String getStreetName() {
            return streetName;
        }

        public String getLastName()
        {
            return lastName;
        }


        @Override
        public String toString() {
            return "Address{" +
                    "houseNumber=" + houseNumber +
                    ", streetName='" + streetName + '\'' +
                    '}';
        }
    }

    private String group;
    private Address address;

    public Student(String name, int age, int time, String group) {
        super(name, age, time);
        this.group = group;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void sayName() {
        System.out.println(name);
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "group='" + group + '\'' +
                ", address=" + address +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
