package com.technicalyorker.calculator.expression;

public class MultiplyExpression extends AbstractDualOperationExpression {
	@Override
	public Double evaluate() {
		return getInputs()[0].evaluate() * getInputs()[1].evaluate();
	}
}