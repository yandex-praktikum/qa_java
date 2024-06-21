import com.example.Animal;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
public class AnimalTest {

    @Test
    public void getFood_herbivore() throws Exception {
        Animal animal = new Animal();
        assertEquals(List.of("Трава", "Различные растения"), animal.getFood("Травоядное"));
    }

    @Test
    public void getFoodPredator() throws Exception {
        Animal animal = new Animal();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), animal.getFood("Хищник"));
    }

    // Добавлен тест для исключения
    @Test(expected = Exception.class)
    public void getFoodUnknownAnimal() throws Exception {
        Animal animal = new Animal();
        animal.getFood("Неизвестный вид");
    }

    @Test
    public void getFamily() {
        Animal animal = new Animal();
        assertNotNull(animal.getFamily());
    }
}