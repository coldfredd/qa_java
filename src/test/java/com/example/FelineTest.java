package com.example;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    private Feline feline;
    private List<String> expectedFood;

    @Before
    public void setFeline() {
        feline = new Feline();
        expectedFood = List.of("Животные", "Птицы", "Рыба");
    }

    @Test
    public void testEatMeat() throws Exception{
        List<String> felineFood = feline.eatMeat();
        assertEquals(expectedFood, felineFood);
    }

    @Test
    public void getFamilyTest() {
        assertEquals("Кошачьи",feline.getFamily());
    }
    @Test
    public void testGetKittens() {
        assertEquals(1,feline.getKittens());
    }
}