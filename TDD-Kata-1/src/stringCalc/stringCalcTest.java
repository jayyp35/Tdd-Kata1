package stringCalc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class stringCalcTest {

	@Test
	void checkEmpty() {
		assertEquals(0,stringCalc.Add(""));
	}

}
