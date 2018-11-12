package main;

public interface Chain {
	
	public void setNextChain(Chain nextChain);
	
	public void calculate(Operands request);

}
