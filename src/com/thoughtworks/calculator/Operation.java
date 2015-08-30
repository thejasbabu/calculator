//the operation class performs various operations
package com.thoughtworks.calculator;

public class Operation {
    private String command;

    public Operation(String command) {
        this.command = command;
    }

    public double performed(double operandOne) {
        double oprandTwo;
        if (command.contains("add")) {
            oprandTwo = Double.parseDouble(command.split(" ")[1]);
            operandOne += oprandTwo;
            return operandOne;
        } else if (command.contains("subtract")) {
            oprandTwo = Double.parseDouble(command.split(" ")[1]);
            operandOne -= oprandTwo;
            return operandOne;
        } else if (command.contains("multiply")) {
            oprandTwo = Double.parseDouble(command.split(" ")[1]);
            operandOne *= oprandTwo;
            return operandOne;
        } else if (command.contains("divide")) {
            oprandTwo = Double.parseDouble(command.split(" ")[1]);
            operandOne /= oprandTwo;
            return operandOne;
        }
        return 0;
    }
}
