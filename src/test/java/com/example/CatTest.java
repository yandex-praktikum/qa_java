package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CatTest {
    private Feline feline;

    @Test
    public void shouldBeCatSound() {
        Cat cat = new Cat(feline);
        String expected = "Мяу";
        String actual = cat.getSound();
        assertEquals(expected, actual);
    }
}
