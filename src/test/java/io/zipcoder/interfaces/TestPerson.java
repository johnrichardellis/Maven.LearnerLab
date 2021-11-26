package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {


    @Test // testing both ID and name in one
    public void testSetIdAndSetName() {
        // given
        Person person = new Person(522L, "DB");
        Long expectedId = 522L;
        String expectedName = "DB";


        // when
        Long actualId = person.getId();
        String actualName = person.getName();

        // then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }


}
