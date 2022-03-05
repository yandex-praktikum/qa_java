import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.mockito.Mock;
import java.lang.Exception;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest {

    @Mock
    private Feline feline;

    @Test
    public void getSoundCorrectValue() {

        Cat cat = new Cat(feline);
        String actualValue = cat.getSound();
        String expectedValue = "Мяу";
        assertEquals (expectedValue, actualValue);

    }

    @Test(expected = NullPointerException.class)
    public void getFoodNullValue() throws Exception {

        Cat cat = new Cat(feline);
        List<String> value = cat.getFood();
        value.get(0);

    }

}
