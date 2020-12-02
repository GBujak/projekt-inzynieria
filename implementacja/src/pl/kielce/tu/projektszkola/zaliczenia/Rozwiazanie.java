package pl.kielce.tu.projektszkola.zaliczenia;
// Damian Linek

import java.util.List;

public class Rozwiazanie implements IRozwiazanie{

	private List<String> rozwiazania;
	private Ocena ocena;
	
	public Rozwiazanie()
	{
		
	}
	
	@Override
	public void ocenRozwiazanie(int wartosc, String opis)
	{
		ocena = new Ocena(wartosc, opis);
	}
	
	@Override
	public void dodajOdpowiedz(String odpowiedz)
	{
		rozwiazania.add(odpowiedz);
	}
}
