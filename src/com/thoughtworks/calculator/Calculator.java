//Class Calculator calculates the result of operation performed on operand
package com.thoughtworks.calculator;

public class Calculator {
    private double result;

    public Calculator() {
        result = 0;
    }

    public double resultOf(Operation operation) {
        result= operation.performed(result);
        return 0.0;
    }
}
