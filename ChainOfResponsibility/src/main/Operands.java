package main;

public class Operands {
	
	private int operand1;
	private int operand2;
	private String operation;
	
	public Operands(int _number1, int _number2, String _operation) {
		
		operand1 = _number1;
		operand2 = _number2;
		operation = _operation;
	}
	
	public int getOperand1() {
		
		return operand1;
	}
	
	public int getOperand2() {
		
		return operand2;
	}
	
	public String getOperation() {
		
		return operation;
	}

}
