package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Параметризованные тесты класса Feline")
public class FelineParameterizedTest {

    private Feline feline = new Feline();

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 5, 10})
    @DisplayName("Проверка метода getKittens(int) возвращает переданное количество котят")
    public void testGetKittensWithParameterReturnsCorrectCount(int kittensCount) {
        int result = feline.getKittens(kittensCount);
        assertEquals(kittensCount, result);
    }

}
