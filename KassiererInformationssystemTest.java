package Parkhouse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KassiererInformationssystemTest {

	@Test
	public void mult_ValidValueInput_ReturnsExpectedValue() {
		Kassierer k = new Kassierer(5);
		assertEquals(25, k.Parkgebuehren(5));
	}

}
