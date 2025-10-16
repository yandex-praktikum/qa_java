package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@DisplayName("Тесты класса Cat")
public class CatTest {

    @Mock
    private Feline felineMock;

    @Test
    @DisplayName("Проверка метода getSound() возвращает 'Мяу'")
    public void testGetSoundReturnsMeow() {
        Cat cat = new Cat(felineMock);
        String sound = cat.getSound();
        assertEquals("Мяу", sound);
    }

    @Test
    @DisplayName("Проверка метода getFood() возвращает результат из Predator.eatMeat()")
    public void testGetFoodReturnsEatMeatResult() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        when(felineMock.eatMeat()).thenReturn(expectedFood);

        Cat cat = new Cat(felineMock);
        List<String> result = cat.getFood();

        assertEquals(expectedFood, result);
        verify(felineMock).eatMeat();
    }

    @Test
    @DisplayName("Проверка что getFood() вызывает eatMeat() ровно один раз")
    public void testGetFoodCallsEatMeatOnce() throws Exception {
        when(felineMock.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        Cat cat = new Cat(felineMock);
        cat.getFood();

        verify(felineMock, times(1)).eatMeat();
    }

    @Test
    @DisplayName("Проверка что getFood() выбросит исключение если eatMeat() выбросит исключение")
    public void testGetFoodThrowsExceptionWhenEatMeatThrows() throws Exception {
        when(felineMock.eatMeat()).thenThrow(new Exception("Test exception"));

        Cat cat = new Cat(felineMock);

        assertThrows(Exception.class, () -> cat.getFood());
        verify(felineMock).eatMeat();
    }

}
