import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestFeline {
  
  @Spy 
  private Feline feline;
  
  
  @Test
  public void testEatMeat() throws Exception {
    Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
  }
  
  @Test
  public void testGetFamily() {
    Assert.assertEquals("Кошачьи", feline.getFamily());
  }
  
  @Test
  public void testGetKittensNoParamWith1() {
    feline.getKittens();
    Mockito.verify(feline, Mockito.times(1)).getKittens(1);
  }
  @Test
  public void testGetKittensAnyInt() {
    Assert.assertEquals(10, feline.getKittens(10));
  }
}
