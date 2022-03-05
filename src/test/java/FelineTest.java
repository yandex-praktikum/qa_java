import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void getEatMeatCorrectValue() throws Exception {

        Feline feline = new Feline();
        List<String> actualValue = feline.eatMeat();
        List<String> expectedValue = List.of("Животные", "Птицы", "Рыба");
        assertEquals (expectedValue, actualValue);

    }

    @Test
    public void getFamilyReturnsCorrectValue() {

        Feline feline = new Feline();
        String actualValue = feline.getFamily();
        String expectedValue = "Кошачьи";
        assertEquals (expectedValue, actualValue);

    }

    @Test
    public void getKittensCorrectValueWithValue() {
        final int kittensCount = 3;

        Feline feline = new Feline();
        int actualValue = feline.getKittens(kittensCount);
        int expectedValue = 3;
        assertEquals (expectedValue, actualValue);
    }

    @Test
    public void getKittensCorrectValueWithoutValue() {

        Feline feline = new Feline();
        int actualValue = feline.getKittens();
        int expectedValue = 1;
        assertEquals (expectedValue, actualValue);
    }

}
