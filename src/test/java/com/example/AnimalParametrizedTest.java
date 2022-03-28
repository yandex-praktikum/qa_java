package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class AnimalParametrizedTest {
    private final String expected;
    private final String animalKind;

    public AnimalParametrizedTest(String animalKind, String expected) {
        this.animalKind = animalKind;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] testAnimalConstructorData() {
        return new Object[][] {
                {"Травоядное", "Трава, Различные растения"},
                {"Хищник", "Животные, Птицы, Рыба"},
                {"Рыба", "Неизвестный вид животного, используйте значение Травоядное или Хищник"}
        };
    }

    @Test
    public void getFoodTest() throws Exception {
        Animal animal = new Animal();
        try {
            List<String> actual = animal.getFood(animalKind);
            List<String> items = Arrays.asList(expected.split(", "));
            Assert.assertEquals(items, actual);
        } catch (Exception exception){
            String actual = exception.getMessage();
            Assert.assertEquals(expected, actual);
        }
    }
}
