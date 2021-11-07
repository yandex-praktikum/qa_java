package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class TestCat {

    @Mock Feline feline;

    @Test
    public void TestCatSounds(){
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";
        assertEquals(expectedSound, cat.getSound());
    }

    @Test
    public void TestCatFood() throws Exception{
        Cat cat = new Cat(feline);
        Mockito.when(cat.getFood()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualFood = cat.getFood();
        assertEquals(expectedFood, actualFood);
    }
}