package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testInstanceOf() {
        // given
        Student student = new Student(624L, "Tommy");


        // when
        boolean actual = student instanceof Learner;

        // then
        Assert.assertTrue(actual);
    }



    @Test
    public void testInheritance() {
        // given
        Student student = new Student(904L, "Johnny");

        // when
        boolean actual = student instanceof Person;

        // then
        Assert.assertTrue(actual);
    }


    @Test
    public void testLearn() {
        // given
        Student student = new Student(104L, "Patricia");
        double expected = 2;

        // when
        student.learn(2);
        double actual = student.getTotalStudyTime();

        // then
        Assert.assertEquals(expected, actual, 0);
    }
}
