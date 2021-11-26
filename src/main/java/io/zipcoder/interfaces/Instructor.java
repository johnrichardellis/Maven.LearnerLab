package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{

// constructor matching superclass
    public Instructor(Long id, String name) {
        super(id, name);
    }


    public void teach(Learner learner, double numberOfHours) {

        learner.learn(numberOfHours);

    }


    public void lecture(Learner[] learners, double numberOfHours) {

        double numberOfHoursPerLearner = numberOfHours / learners.length;

        for (int i = 0; i < learners.length; i++) {     // goes through every learner in learners array
            learners[i].learn(numberOfHoursPerLearner); // takes this new NHPL var and assigns it to each learner in learners array
        }

    }
}
