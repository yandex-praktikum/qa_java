import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class LionTest {
    private static final List<String> EXPECTED_FOOD = List.of("Животные", "Птицы", "Рыба");

    @Mock
    private Feline feline;

    @Test
    void invalidSexThrowsException() {
        assertThrows(Exception.class, () -> new Lion("Неизвестно", feline));
    }

    @Test
    void getKittens() throws Exception {
        when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самец", feline);
        assertEquals(1, lion.getKittens());
    }

    @Test
    void getFood() throws Exception {
        when(feline.eatMeat()).thenReturn(EXPECTED_FOOD);
        Lion lion = new Lion("Самец", feline);
        assertEquals(EXPECTED_FOOD, lion.getFood());
    }
}