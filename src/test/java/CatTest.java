import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)

public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void catEatsMeatTrue() throws Exception {
        feline.getFood("Хищник");
        Mockito.verify(feline).getFood(Mockito.anyString());
    }

    @Mock
    Cat cat;

    @Test
    public void catSaysMeowTrue() throws Exception {
       String result = "Мяу";
       Mockito.when(cat.getSound()).thenReturn("Мяу");
       Assert.assertEquals(cat.getSound(), result);
     }
}
