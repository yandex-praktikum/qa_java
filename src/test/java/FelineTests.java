import com.example.Feline;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTests {

    Feline feline = new Feline();

    @Test
    public void felineFoodTest() throws Exception {
        List<String> actualList = feline.eatMeat();
        List<String> expectedList = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expectedList, actualList);
    }

    @Test
    public void felineFamalyTest() {
        String actualFamaly = feline.getFamily();
        assertEquals("Кошачьи", actualFamaly);
    }

    @Test
    public void felineKittensTest() {
        int actualKittens = feline.getKittens();
        assertEquals(1, actualKittens);
    }

}
