package io.zipcoder.interfaces;

public interface Teacher {

    void teach(Student student, double numberOfHours);

    void lecture(Student[] students, double numberOfHours);
}
