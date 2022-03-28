package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionMockTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int expected = 1;
        Mockito.when(lion.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        Assert.assertEquals(expected, actual);
    }
}
