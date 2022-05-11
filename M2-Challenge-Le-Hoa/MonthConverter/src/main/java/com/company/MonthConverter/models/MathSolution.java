package com.company.MonthConverter.models;

import javax.validation.constraints.NegativeOrZero;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class MathSolution {

    @NotNull(message = "operand1 is anEmpty values")
    private Integer operand1;
    @NegativeOrZero(message = "Can not divide by Zero")
    @NotNull(message = "operand2 is an Empty values")
    private Integer operand2;

    private String operation;
    private Integer answer;

    public MathSolution() {
    }
    public MathSolution(Integer operand1, Integer operand2, String operation, Integer answer) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;
        this.answer = answer;
    }

    public Integer getOperand1() {
        return operand1;
    }

    public void setOperand1(Integer operand1) {
        this.operand1 = operand1;
    }

    public Integer getOperand2() {
        return operand2;
    }

    public void setOperand2(Integer operand2) {
        this.operand2 = operand2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Integer getAnswer() {
        return answer;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }

    public Integer add(Integer operand1, Integer operand2) {
        return operand1 + operand2;
    }
    public Integer subtract(Integer operand1, Integer operand2) {
        return operand1 - operand2;
    }
    public Integer divide(Integer operand1, Integer operand2) {
        return operand1 / operand2;
    }
    public Integer multiply(Integer operand1, Integer operand2) {
        return operand1 * operand2;
    }
}
