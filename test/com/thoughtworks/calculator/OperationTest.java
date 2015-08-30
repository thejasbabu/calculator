package com.thoughtworks.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class OperationTest {

    @Test
    public void additionPerformedOnResultOfFiveShouldProduceFive() {
        Operation operation = new Operation("add 5");

        assertEquals(10, operation.performed(5), 0.0);
    }
}