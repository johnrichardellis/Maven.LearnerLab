package io.zipcoder.interfaces;

public class Student extends Person implements Learner{

    private double totalStudyTime;

    // constructor matching super
    public Student(Long id, String name) {
        super(id, name);
    }


    public void learn(double NumberOfHours) {
        totalStudyTime = totalStudyTime + NumberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}