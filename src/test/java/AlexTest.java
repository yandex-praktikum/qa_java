import com.example.Feline;
import com.example.Alex;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class AlexTest {

    @Test
    public void getFriends() throws Exception {
        Feline felineMock = mock(Feline.class);
        Alex alex = new Alex(felineMock);
        assertEquals(List.of("Марти", "Глория", "Мелман"), alex.getFriends());
    }

    @Test

    public void getPlaceOfLiving() throws Exception {
        Feline felineMock = mock(Feline.class);
        Alex alex = new Alex(felineMock);
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void getKittens() throws Exception {
        Feline felineMock = mock(Feline.class);
        Alex alex = new Alex(felineMock);
        assertEquals(0, alex.getKittens());
    }
    @Test
    public void getFood() throws Exception {
        Feline felineMock = mock(Feline.class);
        when(felineMock.eatMeat()).thenReturn(List.of("Животные", "Птицы"));
        Alex alex = new Alex(felineMock);
        assertEquals(List.of("Животные", "Птицы"), alex.getFood());
    }
}