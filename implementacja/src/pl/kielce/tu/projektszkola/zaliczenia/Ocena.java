package pl.kielce.tu.projektszkola.zaliczenia;
// Damian Linek

public class Ocena {
	
	private int wartosc;
	private String opis;
	
	public Ocena(int wartosc, String opis)
	{
		this.wartosc = wartosc;
		this.opis = opis;
	}

	public int getWartosc() {
		return wartosc;
	}

	public String getOpis() {
		return opis;
	}
}
