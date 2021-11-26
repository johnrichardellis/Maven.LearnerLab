package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {


    @Test
    public void testImplementation() {
        // given
        Instructor instructor = new Instructor(69L, "Larry");

        // when
        boolean actual = instructor instanceof Teacher;

        // then
        Assert.assertTrue(actual);
    }


    @Test
    public void testInheritance() {
        //given
        Instructor instructor = new Instructor(56L, "Randy");

        //when
        boolean actual = instructor instanceof Person;

        //then
        Assert.assertTrue(actual);

    }


    @Test
    public void testTeach() { //  given instructor & student. instructor teaches 67 hours. student time goes up 67 hours.
        //given
        Instructor instructor = new Instructor(345L, "Cooper");
        Student student = new Student(789L, "Mike Downs");
        double expected = 67;

        //when
        instructor.teach(student, 67);
        double actual = student.getTotalStudyTime();

        //then
        Assert.assertEquals(expected, actual, 0);

    }


    @Test
    public void testLecture() {
        //given
        Instructor instructor = new Instructor(345L, "Cooper");
        Student student1 = new Student(789L, "Mike Downs");
        Student student2 = new Student(482L, "Adam Felman");
        Student student3 = new Student(458L, "Jim Pepe");
        Student[] threeStudents= {student1, student2, student3};

        //when
        instructor.lecture(threeStudents, 66);
        double expected = 22;
        double actual = student1.getTotalStudyTime();


        //then
        Assert.assertEquals(expected, actual, 0);


    }
}
