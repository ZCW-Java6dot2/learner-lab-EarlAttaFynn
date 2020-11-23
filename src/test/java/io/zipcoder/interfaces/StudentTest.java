package io.zipcoder.interfaces;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student studentTest = new Student("Jabookie");
    @BeforeEach
    void setUp() {
    }

    @Test
    void testImplementation() {
        Assertions.assertTrue(studentTest instanceof Learner);
    }

    @Test
    void testInheritance() {
        Assertions.assertTrue(studentTest instanceof Person);
    }

    @Test
    void testLearn() {
        //Given
        double numberOfHours = 14;

        //When
        studentTest.learn(numberOfHours);
        double actual = studentTest.getTotalStudyTime();

        //Then
        Assertions.assertEquals(numberOfHours, actual);
    }

}