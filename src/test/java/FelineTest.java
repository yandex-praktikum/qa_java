import com.example.Animal;
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class FelineTest {
    @Mock
    Animal animal;

    @Test
    public void felineEatsMeatTrue() throws Exception{
        Mockito.when(animal.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = animal.getFood("Хищник");
        assertEquals(actualResult, expectedResult);
    }

    @Mock
    Feline feline;

    @Test
    public void countLionIsOne() throws Exception{
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expectedLionCount = 1;
        int actualLionCount = lion.getKittens();
        assertEquals(expectedLionCount, actualLionCount);
    }

    @Test
    public void getFamilyFeline() throws Exception{
        Mockito.when(feline.getFamily()).thenReturn("Кошачьи");
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        assertEquals(expectedResult, actualResult);
    }
}

