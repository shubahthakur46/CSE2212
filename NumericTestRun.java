package main;

public class NumericTestRun {

	public static void main(String[] args) {
		NumericTest isEven = (n) -> (n%2) == 0;
		NumericTest isNegetive = (n) -> (n<0);
		MyGreetings greetings = (name) -> "Good Morning " + name;
		
		System.out.println(isEven.computeTest(5));
		System.out.println(isEven.computeTest(12));
		System.out.println(isNegetive.computeTest(5));
		System.out.println(isNegetive.computeTest(-4));
		
		System.out.println(greetings.morningGreetings("Urmi"));
		System.out.println(greetings.morningGreetings("Khushi Apu"));
		System.out.println(greetings.morningGreetings("Boss"));
		System.out.println(greetings.morningGreetings("P.P."));
		System.out.println(greetings.morningGreetings("Students"));
	}

}
