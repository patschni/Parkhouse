package Parkhouse;

public class Kassierer implements KassiererInformationssystem {
	private double stundenpreis;

	public Kassierer(double stundenpreis) {
		this.stundenpreis = stundenpreis;
	}

	@Override
	public double Parkgebuehren(Ticket t) {
		return t.parkdauer() * stundenpreis;
	}

}
