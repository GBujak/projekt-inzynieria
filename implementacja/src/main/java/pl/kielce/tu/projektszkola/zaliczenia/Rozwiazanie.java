package pl.kielce.tu.projektszkola.zaliczenia;
// Damian Linek

import pl.kielce.tu.projektszkola.dydaktyka.Uczen;

import java.util.ArrayList;
import java.util.List;

public class Rozwiazanie implements IRozwiazanie{
	private Uczen uczen;
	private List<String> odpowiedzi;
	private Ocena ocena;
	private Test test;

	public Rozwiazanie(Test test, Uczen uczen) {
		this.test = test;
		this.uczen = uczen;
		this.odpowiedzi = new ArrayList<>();
	}

	public Rozwiazanie(Test test, Uczen uczen, List<String> odpowiedzi) {
		this.test = test;
		this.uczen = uczen;
		this.odpowiedzi = odpowiedzi;
	}

	@Override
	public void ocenRozwiazanie(int wartosc, String opis) {
		ocena = new Ocena(wartosc, opis);
	}

	@Override
	public void dodajOdpowiedz(String odpowiedz) {
		odpowiedzi.add(odpowiedz);
	}

	public List<String> getOdpowiedzi() {
		return odpowiedzi;
	}

	public Ocena getOcena() {
		return ocena;
	}

	public Uczen getUczen() {
		return uczen;
	}

	public Test getTest() {
		return test;
	}
}
