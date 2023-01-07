import com.example.Feline;
import com.example.Lion;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.junit.Assert;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class TestLion {
    @Mock
    Feline feline;

    @Test
    public void testHasManeTrue () throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue("Ошибка: ФР не соответствует ОР", lion.doesHaveMane());
    }
    @Test
    public void testHasManeFalse () throws Exception {
        Lion lion = new Lion("Самка", feline);
        assertFalse("Ошибка: ФР не соответствует ОР", lion.doesHaveMane());
    }
    @Test
    public void testHasManeOther () throws Exception   {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion("Львица", feline);
        });
        String expectedResult = "Используйте допустимые значения пола животного - самец или самка";
        assertEquals("Ошибка: ФР не соответствует ОР", expectedResult, exception.getMessage());
    }
    @Test
    public void testGetKittens () throws Exception {
        Lion lion = new Lion("Самец", new Feline());
        int expectedResult = 1;
        assertEquals("Ошибка: ФР не соответствует ОР", expectedResult, lion.getKittens());
    }
    @Test
    public void testGetFood () throws Exception {
        Lion lion = new Lion("Самец", new Feline());
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals("Ошибка: ФР не соответствует ОР", expectedResult, lion.getFood());
    }
}
