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
	void checknegative() throws Exception{
			assertEquals(-1,stringCalc.Add("//;\n1;2;-3;-4"));
			throw new Exception("negatives not allowed - " + stringCalc.negatives);
		
	}
	
	@Test
	void greaterthan1000() {
		assertEquals(3,stringCalc.Add("//;\n1;2;1001"));
	}
	
	@Test
	void longdelimiter() {
		assertEquals(6,stringCalc.Add("//###\n1###2###3"));
	}

}
