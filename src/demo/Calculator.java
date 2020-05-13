package demo;

import java.util.Map;
import java.util.function.BinaryOperator;

public class Calculator
{
  public static double calculate(final String operator, final double a, final double b) {
    return Lookup.operator(operator).apply(a, b);
  }
}

class Lookup
{
  static final Map<String, BinaryOperator<Double>> lookup = Map.of("+", (a, b) -> a + b);

  static BinaryOperator<Double> operator(final String operator) {
    final BinaryOperator<Double> operation = lookup.get(operator);

    if (operation == null) {
      throw new IllegalArgumentException(String.format("Operator '%s' not supported.", operator));
    }

    return operation;
  }
}
