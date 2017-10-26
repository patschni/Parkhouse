package Parkhouse;

public class Kassierer implements KassiererInformationssystem {
	private double stundenpreis;

	public Kassierer(double stundenpreis) {
		this.stundenpreis = stundenpreis;
	}
	
	@Override
	public double Parkgebuehren(double stunden) {
		return stunden*stundenpreis;
	}

}
