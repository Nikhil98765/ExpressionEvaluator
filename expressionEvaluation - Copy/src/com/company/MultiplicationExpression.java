package com.company;

public class MultiplicationExpression extends BinaryExpression {

    public MultiplicationExpression(BinaryOperator bop, Operand op1, Operand op2) {
        super(bop, op1, op2);
    }

    @Override
    public Double eval() {
        return Double.parseDouble(op1.data) * Double.parseDouble(op2.data);
    }

}
