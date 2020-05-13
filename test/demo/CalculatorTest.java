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
  void shouldFailOnUnsupportedOperator() {
    assertThrows(IllegalArgumentException.class, () -> {
      Calculator.calculate("?", 1f, 3f);
    });
  }
}
