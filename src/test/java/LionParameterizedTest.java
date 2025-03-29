import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.Feline;
import com.example.Lion;

public class LionParameterizedTest {

    @ParameterizedTest
    @CsvSource({
            "Самец, true",
            "Самка, false"
    })
    void doesHaveMane_WithDifferentSex_ReturnsCorrectResult(String sex, boolean expected) throws Exception {
        Lion lion = new Lion(sex, new Feline());
        assertEquals(expected, lion.doesHaveMane());
    }
}