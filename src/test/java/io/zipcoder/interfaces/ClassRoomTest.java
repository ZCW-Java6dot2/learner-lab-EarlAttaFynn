package io.zipcoder.interfaces;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClassRoomTest {

    ClassRoom test = new ClassRoom();

    @Test
    void getRoster() {
        //When
        ArrayList<Person> people = new ArrayList<Person>(ZipCodeWilmington.getInstructorList().size() + TechConnect.getStudentList().size());
        for (Instructor i: ZipCodeWilmington.getInstructorList()) {
            people.add(i);
        }
        for (Student i: TechConnect.getStudentList()) {
            people.add(i);
        }

        Assertions.assertTrue(test.getRoster().values().containsAll(people));
    }
}