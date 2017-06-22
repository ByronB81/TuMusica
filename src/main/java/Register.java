import java.text.DecimalFormat;

public class Register {
  private Double total = 0.00;

  public Double registerReport() {
    // String formattedTotal = total.decimalFormat();
    return total;
  }

  public static String decimalFormat(double number) {
    DecimalFormat df = new DecimalFormat("0.00");
    return df.format(number).toString();
  }

}
