package io.zipcoder.interfaces;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ZipCodeWilmingtonTest {

    //Given
    String[] instructorNames = { "Leon", "Tariq", "Froilan", "David", "Zach", "Iyasu" };

    @BeforeEach
    void setUp() {
        //Also given
        ZipCodeWilmington.fireStaff();
    }

    @Test
    void testHire() {
        //When
        for (String i : instructorNames) {
            Instructor instructor = new Instructor(i);
            ZipCodeWilmington.hire(instructor);
        }

        //Then
        Assertions.assertFalse(ZipCodeWilmington.getInstructorList().isEmpty());
        Assertions.assertEquals(instructorNames.length, ZipCodeWilmington.getInstructorList().size());
    }

    @Test
    void testFireStaff() {
        Assertions.assertTrue(ZipCodeWilmington.getInstructorList().isEmpty());
    }
}