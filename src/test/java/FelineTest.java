import com.example.Feline;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Enclosed.class)
public class FelineTest {

    @Test
    public void eatMeatPredator() throws Exception {
        Feline feline = new Feline();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensDefault() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @RunWith(Parameterized.class)
    public static class ParameterizedKittensTest {
        @Parameterized.Parameters
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][] {
                    {1, 1},
                    {2, 2},
                    {5, 5}
            });
        }

        private int kittensCount;
        private int expectedKittens;

        public ParameterizedKittensTest(int kittensCount, int expectedKittens) {
            this.kittensCount = kittensCount;
            this.expectedKittens = expectedKittens;
        }

        @Test
        public void getKittensParameterized() {
            Feline feline = new Feline();
            assertEquals(expectedKittens, feline.getKittens(kittensCount));
        }

        @Test
        public void getKittensGivenCount() {
            Feline feline = new Feline();
            assertEquals(3, feline.getKittens(3));
        }

        // Добавлен тест для отрицательного числа котят
        @Test
        public void getKittensNegativeCount() {
            Feline feline = new Feline();
            assertEquals(1, feline.getKittens(-3)); // Ожидаем, что метод вернет 1, так как отрицательное число некорректно
        }

        // Добавлен тест для нулевого числа котят
        @Test
        public void getKittensZeroCount() {
            Feline feline = new Feline();
            assertEquals(1, feline.getKittens(0)); // Ожидаем, что метод вернет 1, так как 0 некорректно
        }
        @Test
        public void eatMeatPredator() throws Exception {
            Feline feline = new Feline();
            assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
        }
        @Test
        public void getFamily() {
            Feline feline = new Feline();
            assertEquals("Кошачьи", feline.getFamily());
        }
        @Test
        public void getKittensDefault() {
            Feline feline = new Feline();
            assertEquals(1, feline.getKittens());
        }
    }
}