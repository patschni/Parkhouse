package Parkhouse;


public class Ticket implements Ticketverarbeitungssystem {
	private boolean status;
	private String iD;
	private double einfahrtszeit;
	private double ausfahrtszeit;
	
	public Ticket(int x, int y) {
		iD=""+x+y;
		einfahrtszeit = System.currentTimeMillis()/3.6;
		status = false;
	}
	
	public Ticketverarbeitungssystem abmeldung() {
		ausfahrtszeit = System.currentTimeMillis()/3.6;
		return this;
	}
	
	public double einfahrtsZeit() {
		return einfahrtszeit;
	}
	
	public double ausfahrtsZeit() {
		return ausfahrtszeit;
	}

	public double parkdauer() {
		return ausfahrtszeit-einfahrtszeit;
	}
	public String ausgabeID() {
		return iD;
	}
	
	public boolean status() {
		return status;
	}
}
