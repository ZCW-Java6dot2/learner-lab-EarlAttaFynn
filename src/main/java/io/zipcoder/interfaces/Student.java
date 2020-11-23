package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    private double totalStudyTime;


    public Student(String name) {
        super(name);
        this.totalStudyTime = 0;
    }

    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }


}
