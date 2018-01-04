package Parkhouse;

public class Parkhaus implements Plan {
	int[][] plan;
	Ticket[] ticket;
	Kassierer kassierer;
	Schrankenwaerter schrankenwaerter;
	KundenInfo kundeninfo;

	public Parkhaus(int x, int y, int stundenpreis) {
		plan = new int[x][y];
		ticket = new Ticket[plan.length * plan[0].length];
		kassierer = new Kassierer(stundenpreis);
		schrankenwaerter = new Schrankenwaerter(gesamtPlaetze());
	}

	@Override
	public boolean belegePosition(int x, int y) {
		if (plan[x][y] == 0) {
			ticket[x * plan[x].length + y] = new Ticket(x, y);
			plan[x][y] = 1;
			return true;
		}
		return false;
	}

	@Override
	public boolean befreiePosition(int x, int y) {
		if (plan[x][y] == 1) {
			plan[x][y] = 0;
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		String g="";
		for(int i = 0; i<plan.length; i++) {
			for (int j = 0; j< plan[i].length; j++) {
				g+=plan[i][j];
			}
		}
		return g;
	}

	public int gesamtPlaetze() {
		return plan.length - 1 * plan[0].length;
	}

	public int anzahlFrei() {
		return kundeninfo.anzahlParkplaetze(plan);
	}

	public int anzahlBelegt() {
		return gesamtPlaetze() - anzahlFrei();
	}

}
