package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.OperatorTestClass;

class OperatorTestUnitTest {
	OperatorTestClass  operatorTestClass = new OperatorTestClass();
	
	@Test
	void additionTest() {
		
		assertEquals(100, operatorTestClass.addition(50, 50));
		assertEquals(50, operatorTestClass.addition(0, 50));
		assertEquals(100, operatorTestClass.addition(67, 33));
		
	}
	
	@Test
	void subtractionTest() {
		
		assertEquals(100, operatorTestClass.subtraction(150, 50));
		assertEquals(100, operatorTestClass.subtraction(100, 0));
		assertEquals(150, operatorTestClass.subtraction(200, 50));
		
	}
	
	@Test
	void divisionTest() {
		
		assertEquals(10, operatorTestClass.division(100, 10));
		assertEquals(0, operatorTestClass.division(0, 100));
		assertEquals(5, operatorTestClass.division(500, 100));
		
	}
	
	@Test
	void multiplicationTest() {
		
		assertEquals(9, operatorTestClass.multiplication(3, 3));
		assertEquals(0, operatorTestClass.multiplication(0, 5));
		assertEquals(100, operatorTestClass.multiplication(10, 10));
		
	}
	
	@Test
	void modulusTest() {
		
		assertEquals(3, operatorTestClass.modulus(103, 50));
		assertEquals(0, operatorTestClass.modulus(0, 100));
		assertEquals(15, operatorTestClass.modulus(15, 100));
		
	}
	
	@Test
	void bitAndTest() {
		
		assertEquals(5, operatorTestClass.bitAnd(5, 5));
		assertEquals(0, operatorTestClass.bitAnd(1, 2));
		assertEquals(1, operatorTestClass.bitAnd(1, 11));
		
	}
	
	@Test
	void bitOrTest() {
		
		assertEquals(5, operatorTestClass.bitOr(5, 5));
		assertEquals(3, operatorTestClass.bitOr(1, 2));
		assertEquals(11, operatorTestClass.bitOr(1, 11));
		
	}
	
	@Test
	void bitNotTest() {
		
		assertEquals(~5, operatorTestClass.bitNot(5));
		assertEquals(~10, operatorTestClass.bitNot(10));
		assertEquals(~100, operatorTestClass.bitNot(100));
		
	}
	
	@Test
	void bitExOrTest() {
		
		assertEquals(0, operatorTestClass.bitExOr(5, 5));
		assertEquals(3, operatorTestClass.bitExOr(1, 2));
		assertEquals(0, operatorTestClass.bitExOr(1, 1));
		
	}
	
}
