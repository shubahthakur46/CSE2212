package main;

public class Main {
	
	public static void main(String[] args) {
		
		Chain chainCalc1 = new Addition();
		Chain chainCalc2 = new Substraction();
		Chain chainCalc3 = new Multiplication();
		Chain chainCalc4 = new Division();
		
		Operands request = new Operands(20, 10, "div");
		chainCalc1.setNextChain(chainCalc2);
		chainCalc2.setNextChain(chainCalc3);
		chainCalc3.setNextChain(chainCalc4);
		
		chainCalc1.calculate(request);
	}

}
