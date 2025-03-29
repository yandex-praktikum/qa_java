import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.Feline;


public class FelineParameterizedTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 5, 10})
    void getKittens_WithDifferentCounts_ReturnsCorrectValues(int count) {
        Feline feline = new Feline();
        assertEquals(count, feline.getKittens(count));
    }
}
