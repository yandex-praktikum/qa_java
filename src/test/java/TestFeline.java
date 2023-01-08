import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class TestFeline
{

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        String expectedResult = "Кошачьи";
        assertEquals("Ошибка: ФР не соответствует ОР",
                feline.getFamily(), expectedResult);
    }
    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals("Ошибка: ФР не соответствует ОР",
                feline.eatMeat(), expectedResult);
    }
}
