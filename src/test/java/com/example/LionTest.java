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
@DisplayName("Тесты класса Lion")
public class LionTest {

    @Mock
    private Feline felineMock;

    @Test
    @DisplayName("Проверка что конструктор выбросит исключение при неправильном поле")
    public void testConstructorThrowsExceptionWithInvalidSex() {
        assertThrows(Exception.class, () -> new Lion("Неизвестный пол", felineMock));
    }

    @Test
    @DisplayName("Проверка сообщения об ошибке при неправильном поле")
    public void testConstructorExceptionMessage() {
        Exception exception = assertThrows(Exception.class, () -> new Lion("Неизвестный", felineMock));
        assertEquals("Используйте допустимые значения пола животного - самей или самка", exception.getMessage());
    }

    @Test
    @DisplayName("Проверка метода doesHaveMane() для самца")
    public void testDoesHaveManeForMale() throws Exception {
        Lion lion = new Lion("Самец", felineMock);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    @DisplayName("Проверка метода doesHaveMane() для самки")
    public void testDoesHaveManeForFemale() throws Exception {
        Lion lion = new Lion("Самка", felineMock);
        assertFalse(lion.doesHaveMane());
    }

    @Test
    @DisplayName("Проверка метода getKittens() возвращает результат из Feline")
    public void testGetKittensReturnsFelineKittens() throws Exception {
        when(felineMock.getKittens()).thenReturn(3);

        Lion lion = new Lion("Самец", felineMock);
        int result = lion.getKittens();

        assertEquals(3, result);
        verify(felineMock).getKittens();
    }

    @Test
    @DisplayName("Проверка что getKittens() вызывает метод Feline.getKittens()")
    public void testGetKittensCallsFelineGetKittens() throws Exception {
        when(felineMock.getKittens()).thenReturn(1);

        Lion lion = new Lion("Самка", felineMock);
        lion.getKittens();

        verify(felineMock, times(1)).getKittens();
    }

    @Test
    @DisplayName("Проверка метода getFood() возвращает результат из Feline.getFood('Хищник')")
    public void testGetFoodReturnsFelinePredatorFood() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        when(felineMock.getFood("Хищник")).thenReturn(expectedFood);

        Lion lion = new Lion("Самец", felineMock);
        List<String> result = lion.getFood();

        assertEquals(expectedFood, result);
        verify(felineMock).getFood("Хищник");
    }

    @Test
    @DisplayName("Проверка что getFood() вызывает Feline.getFood('Хищник') ровно один раз")
    public void testGetFoodCallsFelineGetFoodOnce() throws Exception {
        when(felineMock.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        Lion lion = new Lion("Самка", felineMock);
        lion.getFood();

        verify(felineMock, times(1)).getFood("Хищник");
    }

    @Test
    @DisplayName("Проверка что getFood() выбросит исключение если getFood('Хищник') выбросит исключение")
    public void testGetFoodThrowsExceptionWhenFelineThrows() throws Exception {
        when(felineMock.getFood("Хищник")).thenThrow(new Exception("Test exception"));

        Lion lion = new Lion("Самец", felineMock);

        assertThrows(Exception.class, () -> lion.getFood());
        verify(felineMock).getFood("Хищник");
    }

}
