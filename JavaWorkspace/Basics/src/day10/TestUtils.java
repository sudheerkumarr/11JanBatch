package day10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/*
 * @TestMethodOrder(MethodOrderer.Random.class) - class
 * 
 * @FixMethodOrder(MethodSorters.NAME_ASCENDING) - class
 * @FixMethodOrder(MethodSorters.DEFAULT) - class
 */

//@TestMethodOrder(OrderAnnotation.class)
class TestUtils {

	private Utils utils;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		utils = new Utils();

	}

	@AfterEach
	void tearDown() throws Exception {
		utils = null;
	}

	@Test
	// @Tag("Sanity")
	// @Order(1)
	void testContainsFalse() {
		// Utils utils = new Utils();
		int[] intArr = { 10, 15, 20, 40, 70 };

		boolean result = utils.contains(intArr, 25);
		assertFalse(result);
	}

	@Test
	// @Tag("Sanity")
	//@Order(4)
	void testContainsTrue() {
		// Utils utils = new Utils();
		int[] intArr = { 10, 15, 20, 40, 70 };

		boolean result = utils.contains(intArr, 20);
		assertTrue(result);
	}

	@Test
	// @Disabled
	//@Order(2)
	// @ParameterizedTest("{index} - {0} is palindrome")
	// @ValueSource(strings = { "12321", "pop", "12345" })
	void isPalindromeTrueTest() {
		// Utils utils = new Utils();
		boolean result = utils.isPalindrome("121");
		assertTrue(result);
	}

	@Test
	@DisplayName("Palindrom False Test Case")
	//@Order(3)
	void isPalindromeFalseTest() {
		// Utils utils = new Utils();
		boolean result = utils.isPalindrome("123");
		assertFalse(result);
	}
	
	@Test
	void isPrimeTest() throws InvalidNumberException {
		boolean result= utils.isPrimeNumber(10);
		assertFalse(result);	
	}

	@Test
	void isPrimeExceptionTest() throws InvalidNumberException {
		// boolean result= utils.isPrimeNumer(0);
		//assertFalse(result);	
		InvalidNumberException result = assertThrows(InvalidNumberException.class, ()->{
			utils.isPrimeNumber(0);
		});
		assertEquals("input value should be greater than 1", result.getMessage());
	}
	
	// assertNull, assertNotNull
	@Test
	void employeeNullTest() {
		
		Employee emp = new Employee();
		String name = emp.getEmpName();
		
		assertNull(name);
	}
	
	@Test
	void employeeNotNullTest() {
		
		Employee emp = new Employee(1001, "Ram");
		String name = emp.getEmpName();
		
		assertNotNull(name);
	}
	
}
