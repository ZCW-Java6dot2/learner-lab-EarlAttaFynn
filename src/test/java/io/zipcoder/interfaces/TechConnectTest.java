package io.zipcoder.interfaces;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TechConnectTest {
    //Given
    String[] studentNames = { "Karen", "Liel", "Quinn", "Destiny", "Blesson", "Danielle B.", "Andre", "Jeff",
            "Carlo", "Julia D.", "Natalie", "Julia E.", "Shylee", "Genevieve", "Margo", "Whitney", "Rachel",
            "Bridget", "Seung", "Jessica", "Harry", "Kesler", "Darin", "Jade", "Dominika", "Nashae", "Brianna",
            "Laurent", "Rina", "Emily", "Elisha", "Caitlin", "Kierra", "Dana", "Alyssa", "Humaira", "Prajwal",
            "Cristine",  "Brendan" };

    @BeforeEach
    void setUp() {
        TechConnect.removeStudents();
    }

    @Test
    void recruitStudentTest() {
        //Given
        for (String studentName : studentNames) {
            Student student = new Student(studentName);
            TechConnect.getStudentList().add(student);
        }

        //Then
        Assertions.assertFalse(TechConnect.getStudentList().isEmpty());
        Assertions.assertEquals(TechConnect.getStudentList().size(), studentNames.length);
    }

    @Test
    void removeStudentsTest() {
        Assertions.assertTrue(TechConnect.getStudentList().isEmpty());
    }
}