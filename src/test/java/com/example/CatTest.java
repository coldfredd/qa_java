package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    private List<String> expectedFood;
    private Cat cat;
    @Mock
    Feline feline;
    @Before
    public void setCat() {
        cat = new Cat(feline);
        expectedFood = List.of("Животные", "Птицы", "Рыба");
    }

    @Test
    public void foodCatTest() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(expectedFood);
        List<String> foodCat = cat.getFood();
        assertEquals(expectedFood, foodCat);
    }

    @Test
    public void catSoundTest(){
        String result = cat.getSound();
        assertEquals("Мяу",result);
    }
}