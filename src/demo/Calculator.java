package demo;

import java.util.Map;

public class Calculator
{
  public static double calculate(final String operator, final double a, final double b) {
    return Lookup.operator(operator).calculate(a, b);
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
  static final Map<String, Operation> lookup = Map.of("+", new Plus());

  static Operation operator(final String operator) {
    final Operation operation = lookup.get(operator);

    if (operation == null) {
      throw new IllegalArgumentException(String.format("Operator '%s' not supported.", operator));
    }

    return operation;
  }
}
