package demo;

public class Calculator
{
  public static double calculate(final String operator, final double a, final double b) {
    switch (operator) {
      case "+" :
        return Lookup.operator(operator).calculate(a, b);
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

interface Operation
{
  double calculate(double a, double b);
}

class Plus implements Operation
{
  @Override
  public double calculate(final double a, final double b) {
    return a + b;
  }
}

class Lookup
{
  static Operation operator(final String operator) {
    return new Plus();
  }
}
