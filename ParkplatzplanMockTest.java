package Parkhouse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ParkplatzplanMockTest {
	ParkplatzplanMock ppm = new ParkplatzplanMock();

	@Test
	void belegeposition_setzeEins_returnsFalse() {
		assertFalse(ppm.belegePosition(0, 1));
	}

	@Test
	void belegeposition_setzeEins_returnsTrue() {
		assertTrue(ppm.belegePosition(0, 0));
	}

	@Test
	void befreieposition_setzeEins_returnsFalse() {
		assertFalse(ppm.befreiePosition(0, 2));
	}

	@Test
	void befreieposition_setzeEins_returnsTrue() {
		assertTrue(ppm.befreiePosition(0, 1));
	}

	@Test
	void toString_erwarteterWert_returnsTrue() {
		String value = "0100010011110010";
		assertEquals(value, ppm.toString());
	}

}
