//Class Calculator calculates the result of operation performed on operand
package com.thoughtworks.calculator;

public class Calculator {
    private double result;

    public Calculator() {
        result = 0;
    }

    public double resultOf(String command) {
        double operand;
        if(command.contains("add"))
        {
            operand = Double.parseDouble(command.split(" ")[1]);
            result += operand;
            return result;
        }
        else if(command.contains("subtract")){
            operand = Double.parseDouble(command.split(" ")[1]);
            result -= operand;
            return result;
        }
        else
            return 0;
    }
}
