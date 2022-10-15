package com.pknn.javacourse.lesson2;

import com.pknn.javacourse.lesson3.Name;

public class Person {
    private Name personName;
    private static int numOfPersons;

    public Person() {
        /*
        Empty on purpose
        */
//        System.out.println("Constructor called");
        Person.numOfPersons++;
    }

    public Person(Name personName) {
//         System.out.println("Constructor called");
         this.personName = personName;
         Person.numOfPersons++;
    }

    public Name name() {
        return personName;
    }
    public String helloWorld() {
        return "Hello World";
    }

    public String hello(String name) {
        return "Hello " + name;
    }

    public static int numberOfPersons() {
        return Person.numOfPersons;
    }
}
