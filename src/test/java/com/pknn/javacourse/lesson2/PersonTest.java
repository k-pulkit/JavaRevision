package com.pknn.javacourse.lesson2;

import com.pknn.javacourse.lesson10.LoggingLevel;
import com.pknn.javacourse.lesson3.Name;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {

    private static String[] STAGES = {"STAGE1", "STAGE2", "STAGE3"};
    // get method for the final var
    public static String[] getStages() {
        // only return a copy to protect state contents
        return Arrays.copyOf(PersonTest.STAGES, PersonTest.STAGES.length);
    }

    @Test
    public void shouldReturnHelloWorld() {
        Person per = new Person();
        assertEquals("Hello World", per.helloWorld());
    }

    @Test
    public void shouldReturnMarcus() {
        Person person = new Person();
        assertEquals("Hello Marcus", person.hello("Marcus"));
    }

    @Test
    public void shouldReturnNumberOfPersons() {
        Person p1 = new Person(new Name("Pulkit"));
        Person p2 = new Person();
        Person p3 = new Person();
        assertEquals(5, Person.numberOfPersons());
    }

    @Test
    public void demonstrateArrays() {
        int[] numbers = new int[5];
        for (int i=0; i<5; i++) {
            /* If this was non-primitive.
               then, we will have to do
                    persons[i] = new Person();
            */
            numbers[i] = i;
        }

        for (int num: numbers) {
            System.out.println(num);
        }
    }

    @Test
    public void demonstrateEnums() {
        LoggingLevel state = LoggingLevel.PENDING;
    }



}
