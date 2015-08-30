package com.thoughtworks.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void shouldReturnZeroWhenPassedWithInvalidCommandInitially() {
        Calculator calculator = new Calculator();

        assertEquals(0.0, calculator.resultOf(""), 0.0);
    }

    @Test
    public void shouldReturnFiveWhenAdd5IsPassedInitially() {
        Calculator calculator = new Calculator();

        assertEquals(5.0, calculator.resultOf("add 5"), 0.0);
    }

    @Test
    public void shouldReturnMinusFiveWhenSubtract5IsPassedInitially() {
        Calculator calculator = new Calculator();

        assertEquals(-5.0, calculator.resultOf("subtract 5"), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenMultiply5IsPassedInitially() {
        Calculator calculator = new Calculator();

        assertEquals(0.0, calculator.resultOf("multiply 5"), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenDivide5IsPassedInitially() {
        Calculator calculator = new Calculator();

        assertEquals(0.0, calculator.resultOf("divide 5"), 0.0);
    }

    @Test
    public void shouldReturnTheAdditionOfPreviousResultWithFiveWhenAdd5IsPassed() {
        Calculator calculator = new Calculator();

        calculator.resultOf("add 5");

        assertEquals(10.0, calculator.resultOf("add 5"), 0.0);
    }
}