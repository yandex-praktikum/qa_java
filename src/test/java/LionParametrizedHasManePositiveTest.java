import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrizedHasManePositiveTest {

    private final String checkedSexLion;
    private final boolean expectedResult;

    public LionParametrizedHasManePositiveTest (String checkedSexLion, boolean expectedResult) {
        this.checkedSexLion = checkedSexLion;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[] getSexLionCorrectnessData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},

        };
    }


    @Test
    public void doesHaveManeCorrectValueReturn() throws Exception {

            Lion lion = new Lion(this.checkedSexLion);
            boolean actual = lion.doesHaveMane();
            boolean expected = this.expectedResult;

            assertEquals (expected, actual);

    }
/*
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void doesHaveManeIncorrectValueReturnNegativeResult() throws Exception {

        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage("Используйте допустимые значения пола животного - самей или самка");

        Lion lion = new Lion(this.checkedSexLion);
        boolean actual = lion.doesHaveMane();
        boolean expected = this.expectedResult;

    }
*/
}

