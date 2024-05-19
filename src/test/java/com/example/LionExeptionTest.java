package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionExeptionTest {
    private final String sex;
    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"unknown"},
                {"Альфа-Самка"},
                {"Альфа-Самец"},
                {null}
        };
    }
    public LionExeptionTest(String sex) {
        this.sex = sex;
    }
    @Test
    public void testDoesHaveMane() {
        IndexOutOfBoundsException indexOutOfBoundsException = Assert.assertThrows(IndexOutOfBoundsException.class, () ->
            new Lion(sex, null)
        );
        Assert.assertEquals("Используйте допустимые значения пола животного - самей или самка",indexOutOfBoundsException.getMessage());
    }

}