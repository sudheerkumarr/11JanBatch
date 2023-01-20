package day10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator calc = new Calculator();
	
	 @Test
	 void addTest() {
		 
		 int sum = calc.add(10, 20); // 30
		 assertEquals(30, sum);
	 }
	
	 @Test
	 void subTest() {
		 int sub= calc.sub(-10, 10);
		 assertEquals(-20, sub);
	 }
}
