import com.example.Lion;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrizedHasManeNegativeTest {

    private final String checkedSexLion;
    private final boolean expectedResult;

    public LionParametrizedHasManeNegativeTest (String checkedSexLion, boolean expectedResult) {
        this.checkedSexLion = checkedSexLion;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[] getSexLionCorrectnessData() {
        return new Object[][]{
                {"lion", false},
                {"лев", false},
        };
    }


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
}
