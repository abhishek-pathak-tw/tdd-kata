import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

  @Test
  public void testDollarMultiplication() {
    Dollar five = new Dollar(5);
    assertEquals(new Dollar(10), five.times(2));
    assertEquals(new Dollar(15), five.times(3));
  }

  @Test
  public void testFrancMultiplication() {
    Franc five = new Franc(5);
    assertEquals(new Franc(10), five.times(2));
    assertEquals(new Franc(15), five.times(3));
  }

  @Test
  public void testEquality() {
    Dollar fiveDollar = new Dollar(5);
    Dollar anotherFiveDollar = new Dollar(5);

    assertTrue(fiveDollar.equals(anotherFiveDollar));
    assertFalse(fiveDollar.equals(new Dollar(10)));

    Franc fiveFranc = new Franc(5);
    Franc anotherFiveFranc = new Franc(5);

    assertTrue(fiveFranc.equals(anotherFiveFranc));
    assertFalse(fiveFranc.equals(new Franc(15)));

    assertFalse(fiveFranc.equals(fiveDollar));
  }
}
