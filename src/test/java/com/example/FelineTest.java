package com.example;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void getFamilyTest() {
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensWithoutArgumentsTest() {
        int expected = 1;
        int actual = feline.getKittens();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getKittensWithArgumentTest() {
        int expected = 10;
        int actual = feline.getKittens(10);
        Assert.assertEquals(expected, actual);
    }

}
