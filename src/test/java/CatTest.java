import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import static org.mockito.Mockito.*; // Правильный импорт

public class CatTest {

    @Test
    public void getSound() {
        Cat cat = new Cat(mock(Feline.class));
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFood() throws Exception {
        Feline felineMock = mock(Feline.class);
        when(felineMock.eatMeat()).thenReturn(List.of("Мыши", "Птицы"));
        Cat cat = new Cat(felineMock);
        assertEquals(List.of("Мыши", "Птицы"), cat.getFood());
    }
}