package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    private Lion lion;
    @Mock
    Feline feline;
    @Before
    public void setUp() {
        lion = new Lion("Самец", feline);
    }
    @Test
    public void testGetKittens() {
        Mockito.when(feline.getKittens()).thenReturn(1);
        int result = lion.getKittens();
        Assert.assertEquals(1,result);
    }

    @Test
    public void testGetFood() throws Exception {
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);

        // Проверяем, что метод getFood возвращает ожидаемый список еды
        Assert.assertEquals(expectedFood, lion.getFood());
    }
}
