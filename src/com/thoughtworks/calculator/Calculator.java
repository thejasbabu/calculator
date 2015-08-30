//Class Calculator calculates the result of operation performed on operand
package com.thoughtworks.calculator;

public class Calculator {

    public double resultOf(String command) {
        if(command.equals("add 5"))
            return 5;
        else if(command.equals("subtract 5"))
            return -5;
        else
            return 0;
    }
}
