package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {

    public Instructor(String name) {
        super(name);
    }

    public void teach(Student student, double numberOfHours) {
        student.learn(numberOfHours);
    }

    public void lecture(Student[] students, double numberOfHours) {
        double numberOfHoursPerStudent = numberOfHours / students.length;
        for (Student s : students) {
            s.learn(numberOfHoursPerStudent);
        }
    }
}
