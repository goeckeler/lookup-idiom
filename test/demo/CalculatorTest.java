package demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculatorTest
{

  @Test
  void shouldSupportAddition() {
    assertEquals(4f, Calculator.calculate("+", 1f, 3f));
  }

  @Test
  void shouldSupportSubstraction() {
    assertEquals(4f, Calculator.calculate("-", 7f, 3f));
  }

  @Test
  void shouldSupportMultiplication() {
    assertEquals(21f, Calculator.calculate("*", 3f, 7f));
  }

  @Test
  void shouldSupportDivision() {
    assertEquals(4f, Calculator.calculate("/", 12f, 3f));
  }

  @Test
  void shouldSupportSquareRoot() {
    assertEquals(4f, Calculator.calculate("√", 16f, 0f));
  }

  @Test
  void shouldFailOnUnsupportedOperator() {
    assertThrows(IllegalArgumentException.class, () -> {
      Calculator.calculate("?", 1f, 3f);
    });
  }
}
