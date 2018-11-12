package main;

public class Addition implements Chain{

	private Chain nextInChain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		
		this.nextInChain = nextChain;
	}

	@Override
	public void calculate(Operands request) {
		
		if(request.getOperation() == "add") {
			
			System.out.println(request.getOperand1() + "+"+ request.getOperand2() + "="+ (request.getOperand1()+request.getOperand2()));
		}
		else {
			
			nextInChain.calculate(request);
		}
	}

}
