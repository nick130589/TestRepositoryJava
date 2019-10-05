package com.hillel.lesson14.abstractClassDemo.firstOption;

public class Main {
    public static void main(String[] args) {
      for (int i = 0; i < 5; i++)
      {
          System.out.println(i + ". " + PersonFactory.creationPerson(Man.class) +
                  "\n----------------");
      }

    }
}
