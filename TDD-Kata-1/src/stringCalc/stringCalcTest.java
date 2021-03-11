package stringCalc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class stringCalcTest {

	@Test
	void checkEmpty() {
		assertEquals(0,stringCalc.Add(""));
	}
	
	@Test
	void checksumoftwo() {
		assertEquals(3,stringCalc.Add("1,2"));
	}
	
	@Test
	void checksumofmultiple() {
		assertEquals(10,stringCalc.Add("1,2,3,4"));
	}
	
	@Test
	void addnewlineasdelimiter() {
		assertEquals(6,stringCalc.Add("1\n2,3"));
	}
	
	@Test
	void supportdifferentdelimiters() {
		assertEquals(3,stringCalc.Add("//;\n1;2"));
	}
	
	@Test
	void checknegative() {
			assertEquals(-1,stringCalc.Add("//;\n1;2;-3"));
			System.out.println(stringCalc.negatives);
	}
	

}
