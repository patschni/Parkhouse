package Parkhouse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KundenInformationssystemTest {

	@Test
	void anzahlFreierParkplaetze_EinfacheParkplatzeingabe_GibtRichtigeMengeZurueck() {
		int[][] parkplatz = { { 1, 1, 1, 0 }, { 1, 1, 0, 0 }, { 0, 0, 1, 0 }, { 0, 1, 1, 1 } };
		KundenInfo ki = new KundenInfo();
		assertEquals(7, ki.anzahlParkplaetze(parkplatz));
	}

}
