package com.hillel.lesson11.myStringList;

public class MainTest {
    public static void main(String[] args) {
        IMyList list = new MyListImpl();
        IMyList list2 = new MyIntegerListImpl();
    }

    public static void print(IMyList list)
    {
        list.print();
    }
}
