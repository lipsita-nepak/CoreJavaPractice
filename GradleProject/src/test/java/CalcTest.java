
//import src.test.main.java.Calc;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalcTest {
    
	static Calc calc;
	
    @BeforeAll
	static void initAll() {
	calc=new Calc();
	}
	@Test
	void addTest() {
		assertEquals(40, calc.add(20,20));
	}
	@Test
	void subTest() {
		assertEquals(0, calc.sub(20, 20));
	}
	
	@Test
	void mulTest() {
		assertEquals(400, calc.mul(20, 20));
	}
	@Test
	void isEvenTest() {
		assumeTrue(calc.isEven(10));
	}
	@AfterAll
    static void tearDownAll() {
		calc=null;
	}
	
}
