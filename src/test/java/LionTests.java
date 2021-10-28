import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTests {

    private final String checkedText;
    private final boolean expected;

    public LionTests(String checkedText, boolean expected) {
        this.checkedText = checkedText;
        this.expected = expected;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getMane() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void shouldCheckMane() throws Exception {
        Lion lion = new Lion(checkedText);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }

    @Test
    public void kittenLionTest() throws Exception {
        Lion lion = new Lion("Самец");
        int kittensCount = lion.getKittens(1);
        assertEquals(1, kittensCount);
    }

}
