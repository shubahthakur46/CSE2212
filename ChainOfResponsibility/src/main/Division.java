package main;

public class Division implements Chain{

	private Chain nextInChain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		
		this.nextInChain = nextChain;
	}

	@Override
	public void calculate(Operands request) {
		
		if(request.getOperation() == "div") {
			
			System.out.println(request.getOperand1() + "/" + request.getOperand2() + "=" + (request.getOperand1()/request.getOperand2()));
		}
		else {
			
			System.out.println("Only works for add, sub, mult, div");
		}
	}

}
