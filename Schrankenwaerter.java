package Parkhouse;

public class Schrankenwaerter implements SchrankenwaerterInformationssystem {
	private int parkplaetzeGesamt;
	private int parkplaetzeZaehler;
	
	public Schrankenwaerter (int ppG) {
		parkplaetzeGesamt = ppG;
		parkplaetzeZaehler = 0;
	}
	@Override
	public boolean pruefeAutoAusfahrt(Ticket t) {
		return t.status();
	}
	
	@Override 
	public boolean pruefeAutoEinfahrt() {
		if(parkplaetzeGesamt <=parkplaetzeZaehler) {
			return false;
		}
		return true;
	}

}
