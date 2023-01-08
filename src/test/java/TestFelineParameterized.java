import com.example.Feline;
import org.junit.runner.RunWith;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestFelineParameterized {
    private final int expectedResult;
    private final int actualResult;
    Feline feline = new Feline();

    public TestFelineParameterized (int expectedResult, int numberOfKittens) {
        this.expectedResult = expectedResult;
        actualResult = numberOfKittens;
    }
    @Parameterized.Parameters (name = "Тестовые данные: {0}, {1}")
    public static Object[][] testValues() {
        return new Object[][]{
                {0, 0},
                {1, 1},
                {10, 10},
        };
    }
    @Test
    public void testGetKittens () {
        assertEquals("Ошибка: кол-во котят не совпадает с ожиданием",
                expectedResult, feline.getKittens(actualResult));
    }
}
