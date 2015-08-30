package com.thoughtworks.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class OperationTest {

    @Test
    public void additionOfFivePerformedOnResultOfFiveShouldProduceFive() {
        Operation operation = new Operation("add 5");

        assertEquals(10, operation.performed(5), 0.0);
    }

    @Test
    public void subtractionOfFivePerformedOnResultOfFiveShouldProduceZero() {
        Operation operation = new Operation("subtract 5");

        assertEquals(0.0, operation.performed(5), 0.0);
    }

    @Test
    public void multiplicationByFiveOnResultOfFiveShouldProduce25() {
        Operation operation = new Operation("multiply 5");

        assertEquals(25.0, operation.performed(5), 0.0);
    }
}