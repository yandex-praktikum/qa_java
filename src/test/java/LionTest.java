import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import static org.mockito.Mockito.*;

public class LionTest {

    @Test
    public void constructorMale() throws Exception {
        Feline felineMock = mock(Feline.class);
        Lion lion = new Lion("Самец", felineMock);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void constructorFemale() throws Exception {
        Feline felineMock = mock(Feline.class);
        Lion lion = new Lion("Самка", felineMock);
        assertFalse(lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void constructorInvalidSex() throws Exception {
        Feline felineMock = mock(Feline.class);
        new Lion("Другой пол", felineMock);
    }

    @Test
    public void getKittens() throws Exception {
        Feline felineMock = mock(Feline.class);
        when(felineMock.getKittens()).thenReturn(2);
        Lion lion = new Lion("Самец", felineMock);
        assertEquals(2, lion.getKittens());
    }

    @Test
    public void getFood() throws Exception {
        Feline felineMock = mock(Feline.class);
        when(felineMock.eatMeat()).thenReturn(List.of("Зебры", "Антилопы"));
        Lion lion = new Lion("Самец", felineMock);
        assertEquals(List.of("Зебры", "Антилопы"), lion.getFood());
    }

    @Test
    public void doesHaveManeMale() throws Exception {
        Feline felineMock = mock(Feline.class);
        Lion lion = new Lion("Самец", felineMock);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void doesHaveManeFemale() throws Exception {
        Feline felineMock = mock(Feline.class);
        Lion lion = new Lion("Самка", felineMock);
        assertFalse(lion.doesHaveMane());
    }
}
