package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class TestLionAlex {

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);}

    @Mock
    Feline feline;

    @Test
    public void TestLionAlexKittens(){
        LionAlex lionAlex = new LionAlex(feline);
        int expectedNumberOfKittens = 0;
        assertEquals(expectedNumberOfKittens, lionAlex.getKittens());
    }
    @Test
    public void TestLionAlexFriends(){
        LionAlex lionAlex = new LionAlex(feline);
        List<String> expectedListOfFriends = Arrays.asList("Марти","Глория","Мелман");
        assertEquals(expectedListOfFriends, lionAlex.getFriends());
    }
    @Test
    public void TestLionAlexPlaceOfLiving(){
        LionAlex lionAlex = new LionAlex(feline);
        String expectedPlaceOfLiving = "Нью-Йоркский зоопарк";
        assertEquals(expectedPlaceOfLiving, lionAlex.getPlaceOfLiving());
    }

    @Test
    public void TestLionAlexHasMane(){

        LionAlex lionAlex = new LionAlex(feline);
        boolean expectedMane = true;
        assertEquals(expectedMane, lionAlex.doesHaveMane());
    }

    @Test
    public void TestLionAlexFood() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        List<String> expectedLionAlexFood = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(lionAlex.getFood()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        assertEquals(expectedLionAlexFood, lionAlex.getFood());
    }
}
