package com.hillel.lesson14.abstractClassDemo.secondOption;

public class Main {
    public static void main(String[] args) {
//      for (int i = 0; i < 5; i++)
//      {
//          System.out.println(i + ". " + PersonFactory.creationPerson(new WomanGeneration()) +
//                  "\n----------------");
//      }

      Woman woman = (Woman) PersonFactory.creationPerson(new WomanGeneration());

      Man man = (Man) PersonFactory.creationPerson(new ManGeneration());

        getPerson(man);


    }

    private static void getPerson(Person person) {
        if (person instanceof Man)
        {
            System.out.println("man");
        }
        if (person instanceof Woman)
          {
              System.out.println("woman");
          }
        {
            System.out.println("No");
        }
    }
}
