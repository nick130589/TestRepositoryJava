package com.hillel.lesson11.inheretence;

public class User {
    protected String name;
    protected int age;
    private int time;
    private static int salaryInHour = 20;

    public User(String name, int age, int time) {
        this.name = name;
        this.age = age;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getTime() {
        return time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public static void setSalaryInHour(int salaryInHour) {
        User.salaryInHour = salaryInHour;
    }

    public int getSalary() {
        return time * salaryInHour;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", time=" + time +
                '}';
    }
}
