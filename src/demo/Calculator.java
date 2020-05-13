package demo;

public class Calculator
{
  public static double calculate(final String operator, final double a, final double b) {
    switch (operator) {
      case "+" :
        return a + b;
      case "-" :
        return a - b;
      case "*" :
        return a * b;
      case "/" :
        return a / b;
      case "√" :
        return Math.sqrt(a);
      default :
        throw new IllegalArgumentException(String.format("Operator '%s' is not supported.", operator));
    }
  }
}
