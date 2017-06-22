import java.text.DecimalFormat;

public class Register {
  private double total = 0.00;

  public double registerReport() {
    // int decimalTotal = decimalFormat(total);
    return total;
  }

  public static String decimalFormat(double number) {
    DecimalFormat df = new DecimalFormat("0.00");
    return df.format(number).toString();
  }

}
