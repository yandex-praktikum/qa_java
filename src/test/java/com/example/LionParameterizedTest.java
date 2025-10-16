package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayName("Параметризованные тесты класса Lion")
public class LionParameterizedTest {

    @Mock
    private Feline felineMock;

    @ParameterizedTest
    @CsvSource({
            "Самец, true",
            "Самка, false"
    })
    @DisplayName("Проверка конструктора с разными полами")
    public void testConstructorWithDifferentSexes(String sex, boolean expectedMane) throws Exception {
        Lion lion = new Lion(sex, felineMock);
        assertEquals(expectedMane, lion.doesHaveMane());
    }

}
