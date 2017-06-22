import org.junit.*;
import static org.junit.Assert.*;

public class RegisterTest {

  @Test
  public void decimalFormat_showInPriceFormat_000() {
    Register testRegister = new Register();
    String expectedOutput = "0.00";
    assertEquals(expectedOutput, testRegister.decimalFormat(0.00));

  }

}
