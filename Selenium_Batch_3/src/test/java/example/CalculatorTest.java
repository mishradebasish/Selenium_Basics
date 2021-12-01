package example;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	Calculator calc=new Calculator();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after class");
	}
	
	@Before
	public void b1() {
		System.out.println("Before method");
	}
	
	@After
	public void a1() {
		System.out.println("after method");
	}

	@Test
	public void testAdd1() {
		assertEquals(calc.add1(5,5),10);
	}

	@Test
	public void testSub1() {
		assertEquals(calc.sub1(5,5),0);	
	}

}
