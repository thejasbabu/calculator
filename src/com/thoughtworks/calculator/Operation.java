//the operation class performs various operations
package com.thoughtworks.calculator;

public class Operation {
    private String command;

    public Operation(String command) {
        this.command = command;
    }

    public double performed(double result) {
        double operand;
        if (command.contains("add")) {
            operand = Double.parseDouble(command.split(" ")[1]);
            result += operand;
            return result;
        } else if (command.contains("subtract")) {
            operand = Double.parseDouble(command.split(" ")[1]);
            result -= operand;
            return result;
        } else if (command.contains("multiply")) {
            operand = Double.parseDouble(command.split(" ")[1]);
            result *= operand;
            return result;
        } else if (command.contains("divide")) {
            operand = Double.parseDouble(command.split(" ")[1]);
            result /= operand;
            return result;
        }
        return 0;
    }
}
