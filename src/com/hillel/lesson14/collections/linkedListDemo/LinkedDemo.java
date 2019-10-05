package com.hillel.lesson14.collections.linkedListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Privet");
        linkedList.add("Guys");
        System.out.println(linkedList);

        List<String> arrayList = new ArrayList();
        arrayList.add("Test");
        arrayList.add("Test2");
        arrayList.add(0, "Privet");
        System.out.println(arrayList);

        Iterator<String> iterator = linkedList.iterator();


        System.out.println(linkedList);


        System.out.println(linkedList);

        linkedList.set(1, "TestLinked");

        System.out.println(linkedList);


    }

}
