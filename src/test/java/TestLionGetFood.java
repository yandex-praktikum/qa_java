import com.example.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestLionGetFood {

    @Mock
    Feline feline;

    @Test
    public void lionGetFood() {
        try {
            Lion lion = new Lion("Самец", feline);
            lion.getFood();
            Mockito.verify(feline, Mockito.times(1)).eatMeat();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}