package Parkhouse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SchrankenwaerterInformationssystemTest {

	@Test
	void passieren_AutoFaehrtRaus_AutoWirdDurchgelassen() {
		Schrankenwaerter s = new Schrankenwaerter();
		int[] i = {2131,1};
		assertEquals(true, s.pruefeAuto(i));
	}

}
