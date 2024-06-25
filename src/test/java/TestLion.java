import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class TestLion {
  @Spy
  Lion lion = new Lion("Самец", new Feline());
  
  public TestLion() throws Exception {
  }
  
  @Test
  public void testGetKittens() {
//      Lion lion = new Lion(sex, this.feline);
      Assert.assertEquals(1, lion.getKittens());
  }
  
  @Test
  public void testGetFood() throws Exception {
//      Lion lion = new Lion(sex, this.feline);
      Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
  }
}
