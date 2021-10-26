package com.example;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class TestFeline {

    @Test
    public void TestFelineFamily(){
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        assertEquals(expectedFamily,feline.getFamily());
    }

    @Test
    public void TestFelineHaveOneKitten() {
        Feline feline = new Feline();
        int expectedNumberOfKittens = 1;
        assertEquals(expectedNumberOfKittens, feline.getKittens());
    }
    @Test
    public void TestFelineGetFood() throws Exception{
        Feline feline = new Feline();
        List<String> expectedFelineFood = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expectedFelineFood, feline.eatMeat());
    }
}