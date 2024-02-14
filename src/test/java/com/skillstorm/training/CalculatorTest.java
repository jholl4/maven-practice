package com.skillstorm.training;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void addOnes() {
        assertEquals(2, Calculator.add(1, 1), "Testing addition");
    }

    @Test
    void subtractOneFromTwo() {
        assertEquals(1, Calculator.subtract(2, 1));
    }

    @Test
    void divideByZero() {
        assertThrows(ArithmeticException.class, () -> Calculator.divide(1, 0));
    }

}
