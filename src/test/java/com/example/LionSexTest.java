package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionSexTest {

    private final boolean expectedResult;
    private final String  sex;

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"Самец",true},
                {"Самка",false}
        };
    }

    public LionSexTest(String sex, boolean expectedResult) {
        this.sex = sex;
        this.expectedResult = expectedResult;
    }

    @Test
    public void testDoesHaveMane() {
        Lion lion = new Lion(sex, null);
        Assert.assertEquals(expectedResult, lion.doesHaveMane());
    }

}