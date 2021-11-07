package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestFelineKittens {
    private final int kittensCount;
    private final int expected;

    public TestFelineKittens(int kittensCount, int expected) {
        this.kittensCount = kittensCount;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getNumberOfKittens() {
        return new Object[][]{
                {0, 0},
                {6, 6},
        };
    }

    @Test
    public void TestFelineHaveKittens() {
        Feline feline = new Feline();
        assertEquals(expected,feline.getKittens(kittensCount));
    }
}