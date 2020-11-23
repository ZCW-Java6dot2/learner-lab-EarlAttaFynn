package io.zipcoder.interfaces;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructorTest {

    //When
    private double teachTime = 14;
    Student s1 = new Student("Jabookie");
    Student s2 = new Student("Jamal");
    Student[] students = {s1, s2};
    Instructor instructorTest = new Instructor("Prof. Jabroni");

    @Test
    void testTeach() {
        //When
        instructorTest.teach(s1,teachTime);

        //Then
        Assertions.assertEquals(teachTime, s1.getTotalStudyTime());
    }

    @Test
    void testLecture() {
        //Given
        double expected = teachTime / students.length;

        //When
        instructorTest.lecture(students, teachTime);
        //Then
        Assertions.assertEquals(expected, s1.getTotalStudyTime());
        Assertions.assertEquals(expected, s2.getTotalStudyTime());
    }

    @Test
    void testImplementation() {
        Assertions.assertTrue(instructorTest instanceof Teacher);
    }

    @Test
    void testInheritance() {
        Assertions.assertTrue(instructorTest instanceof Person);
    }
}