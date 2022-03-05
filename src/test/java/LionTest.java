import com.example.Lion;
import org.junit.Test;
import org.mockito.Mock;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionTest {

    @Mock
    private String sex = "Самец";

    @Test
    public void getKittensCorrectValueWithValue() throws Exception {
        final int kittensCount = 3;

        Lion lion = new Lion(sex);
        int actualValue = lion.getKittens(kittensCount);
        int expectedValue = 3;
        assertEquals (expectedValue, actualValue);
    }

    @Test
    public void getKittensCorrectValueWithoutValue() throws Exception {

        Lion lion = new Lion(sex);
        int actualValue = lion.getKittens();
        int expectedValue = 1;
        assertEquals (expectedValue, actualValue);
    }

    @Test
    public void getEatMeatCorrectValue() throws Exception {

        Lion lion = new Lion(sex);
        List<String> actualValue = lion.getFood();
        List<String> expectedValue = List.of("Животные", "Птицы", "Рыба");
        assertEquals (expectedValue, actualValue);

    }
}
