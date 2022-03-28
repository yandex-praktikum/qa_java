package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineParametrizedTest {
    private final int expected;
    private final int kittenCounts;

    public FelineParametrizedTest(int kittenCounts, int expected) {
        this.kittenCounts = kittenCounts;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] testLionConstructorData() {
        return new Object[][] {
                {-10, -10},
                {0, 0},
                {7, 7}
        };
    }

    @Test
    public void kittensCountTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens(kittenCounts);
        Assert.assertEquals(expected, actual);

    }
}

