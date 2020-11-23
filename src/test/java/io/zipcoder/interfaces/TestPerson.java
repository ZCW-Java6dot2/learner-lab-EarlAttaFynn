package io.zipcoder.interfaces;

import org.junit.jupiter.api.Assertions;

public class TestPerson {

    String name = "Jabookie";
    Person testPerson = new Person(name);

    @org.junit.jupiter.api.BeforeEach
    void setUp() {


    }

    @org.junit.jupiter.api.Test
    void getName() {
        //When
        String expected = name;
        String actual = testPerson.getName();

        //Then
        Assertions.assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void setName() {
        //Given
        String expected = "Terrence";

        //When
        testPerson.setName(expected);
        String actual = testPerson.getName();

        //Then
        Assertions.assertEquals(expected, actual);

    }
}
