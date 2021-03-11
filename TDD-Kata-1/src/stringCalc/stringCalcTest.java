package stringCalc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class stringCalcTest {

	@Test
	void checkEmpty() {
		assertEquals(0,stringCalc.Add(""));
	}
	
	void checksumoftwo() {
		assertEquals(3,stringCalc.Add("1,2"));
	}

}
