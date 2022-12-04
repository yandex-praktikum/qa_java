import com.example.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestLionGetKittens {

    @Mock
    Feline feline;

    public void lionGetKittens() {
        feline.getKittens();
        Mockito.verify(feline).getKittens(1);
    }
}
