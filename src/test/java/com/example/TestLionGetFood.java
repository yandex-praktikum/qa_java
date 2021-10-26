package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestLionGetFood {
    @Mock
    Feline feline;

    @Test
    public void TestLionFood() throws Exception{
        Lion lion = new Lion("Самка", feline);
        List<String> expectedLionFood = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(lion.getFood()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        assertEquals(expectedLionFood, lion.getFood());
    }
}
