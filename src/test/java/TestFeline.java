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
  Feline felineSpy = new Feline();

  @Test
  public void testEatMeat() throws Exception {
    Feline feline = new Feline();
    Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"),
            feline.eatMeat());
  }

  @Test
  public void testGetFamily() {
    Feline feline = new Feline();
    Assert.assertEquals("Кошачьи", feline.getFamily());
  }

  @Test
  public void testGetKittensNoParamWith1() {
    felineSpy.getKittens();
    Mockito.verify(felineSpy, Mockito.times(1)).getKittens(1);
  }
  @Test
  public void testGetKittensAnyInt() {
    Feline feline = new Feline();
    Assert.assertEquals(10, feline.getKittens(10));
  }
}
