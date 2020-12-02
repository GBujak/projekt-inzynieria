package pl.kielce.tu.projektszkola.zaliczenia;
// Damian Linek

import java.util.List;

public class Rozwiazanie {

	private List<String> rozwiazania;
	private Ocena ocena;
	
	public Rozwiazanie()
	{
		
	}
	
	public void ocenRozwiazanie(int wartosc, String opis)
	{
		new Ocena(wartosc, opis);
	}
	
	public void dodajOdpowiedz(String odpowiedz)
	{
		rozwiazania.add(odpowiedz);
	}
}
