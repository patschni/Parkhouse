package Parkhouse;

public class KundenInfo implements KundenInformationssystem {

	@Override
	public int anzahlParkplaetze(int[][] parkplatz) {
		int ctr = 0;
		for (int i = 0; i < parkplatz.length; i++) {
			for (int p : parkplatz[i]) {
				if (p == 0) {
					ctr++;
				}
			}
		}
		return ctr;
	}
}
