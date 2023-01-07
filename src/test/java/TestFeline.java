import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class TestFeline
{
    Feline feline = new Feline();
    @Test
    public void testGetFamily() {
        String expectedResult = "Кошачьи";
        assertEquals("Ошибка: ФР не соответствует ОР",
                feline.getFamily(), expectedResult);
    }
    @Test
    public void testEatMeat() throws Exception {
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals("Ошибка: ФР не соответствует ОР",
                feline.eatMeat(), expectedResult);
    }
}
