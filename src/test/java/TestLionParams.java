import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class TestLionParams {
  
  private final String sex;
  private final boolean hasMane;
  private final Feline feline;
  private final String expectedMessage = "Используйте допустимые значения пола животного - самей или самка";
  
  public TestLionParams(String sex, final boolean hasMane) {
    this.sex = sex;
    this.hasMane = hasMane;
    this.feline = new Feline();
  }
  
  @Parameterized.Parameters
  public static Object[][] getCredentials() {
    return new Object[][]{
        {"Самец", true},
        {"Самка", false},
        {"Другое", false},
    };
  }
  
  @Test
  public void testGetKittens() {
    try {
      Lion lion = new Lion(sex, this.feline);
      Assert.assertEquals(1, lion.getKittens());
    } catch (Exception e) {
      Assert.assertEquals(expectedMessage, e.getMessage());
    }
  }
  
  @Test
  public void testDoesHaveMane() throws Exception {
    try {
      Lion lion = new Lion(sex, this.feline);
      Assert.assertEquals(this.hasMane, lion.doesHaveMane());
    } catch (Exception e) {
      Assert.assertEquals(expectedMessage, e.getMessage());
    }
  }
  
  @Test
  public void testGetFood() throws Exception {
    try {
      Lion lion = new Lion(sex, this.feline);
      Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    } catch (Exception e) {
      Assert.assertEquals(expectedMessage, e.getMessage());
    }
  }
}
