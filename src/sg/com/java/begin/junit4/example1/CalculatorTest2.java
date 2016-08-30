package sg.com.java.begin.junit4.example1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest2 {
	private Calculator cal;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("globalInit");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("globalDestroy");
	}

	@Before
	public void setUp() throws Exception {
		cal = new Calculator();
		System.out.println("init invoked");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("destroy invoked");
	}

	@Test
	public void testAdd() {
		int result = cal.add(1, 2);
		assertEquals(3, result);
		//fail("Not yet implemented");
	}

	@Test
	public void testMinus() {
		int result = cal.minus(1, 2);          
        assertEquals(-1, result);
		//fail("Not yet implemented");
	}

	@Test
	public void testMultiply() {
		int result = cal.multiply(2, 3);          
        assertEquals(6, result);
		//fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		try {
			int result = cal.divide(6, 5);
			assertEquals(1, result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//fail("Not yet implemented");
	}
	
	//@Test(expected = ArithmeticException.class) 
	@Test(expected = Exception.class) 
	public void testDivide2() throws Exception {
		cal.divide(6, 0);
	}
	
	@Test(timeout = 100)  
    public void testDivide3(){  
        try{  
        cal.divide(4, 2);  
        Thread.sleep(110);  
        }catch(Exception e){  
            e.printStackTrace();  
        }  
    } 
}
