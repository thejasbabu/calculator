package com.thoughtworks.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void shouldReturnZeroWhenPassedWithInvalidCommandInitially() {
        Calculator calculator = new Calculator();
        Operation operation = new Operation("");

        assertEquals(0.0, calculator.resultOf(operation), 0.0);
    }

    @Test
    public void shouldReturnFiveWhenAdd5IsPassedInitially() {
        Calculator calculator = new Calculator();
        Operation operation = new Operation("add 5");

        assertEquals(5.0, calculator.resultOf(operation), 0.0);
    }

    @Test
    public void shouldReturnMinusFiveWhenSubtract5IsPassedInitially() {
        Calculator calculator = new Calculator();
        Operation operation = new Operation("subtract 5");
        assertEquals(-5.0, calculator.resultOf(operation), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenMultiply5IsPassedInitially() {
        Calculator calculator = new Calculator();
        Operation operation = new Operation("multiply 5");

        assertEquals(0.0, calculator.resultOf(operation), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenDivide5IsPassedInitially() {
        Calculator calculator = new Calculator();
        Operation operation = new Operation("divide 5");

        assertEquals(0.0, calculator.resultOf(operation), 0.0);
    }

    @Test
    public void shouldReturnTheAdditionOfPreviousResultWithFiveWhenAdd5IsPassed() {
        Calculator calculator = new Calculator();
        Operation operation = new Operation("add 5");
        calculator.resultOf(operation);

        operation= new Operation("add 5");

        assertEquals(10.0, calculator.resultOf(operation), 0.0);
    }

    @Test
    public void shouldReturnTheSubtractionFromPreviousResultByFiveWhenSubtract5IsPassed() {
        Calculator calculator = new Calculator();
        Operation operation = new Operation("add 5");
        calculator.resultOf(operation);

        operation = new Operation("subtract 5");

        assertEquals(0.0, calculator.resultOf(operation), 0.0);
    }

    @Test
    public void shouldReturnTheMultiplicationOfPreviousResultByFiveWhenMultiply5IsPassed() {
        Calculator calculator = new Calculator();
        Operation operation = new Operation("add 5");
        calculator.resultOf(operation);

        operation = new Operation("multiply 5");

        assertEquals(25.0, calculator.resultOf(operation), 0.0);
    }

    @Test
    public void shouldReturnTheDivisionOfPreviousResultByFiveWhenDivide5IsPassed() {
        Calculator calculator = new Calculator();
        Operation operation = new Operation("add 5");
        calculator.resultOf(operation);

        operation = new Operation("divide 5");

        assertEquals(1.0, calculator.resultOf(operation), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenCancelCommandIsPassed() {
        Calculator calculator = new Calculator();
        Operation operation = new Operation("cancel");

        assertEquals(0.0, calculator.resultOf(operation), 0.0);
    }
}