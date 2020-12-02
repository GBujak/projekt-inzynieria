package pl.kielce.tu.projektszkola.dydaktyka;
// Grzegorz Bujak

import pl.kielce.tu.projektszkola.Pracownik;

import java.util.List;

public class Nauczyciel extends Pracownik {
    private String specjalizacja;
    private List<Klasa> klasy;
    private List<Przedmiot> przedmioty;

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public void setSpecjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    public List<Klasa> getKlasy() {
        return klasy;
    }

    public void setKlasy(List<Klasa> klasy) {
        this.klasy = klasy;
    }

    public List<Przedmiot> getPrzedmioty() {
        return przedmioty;
    }

    public void setPrzedmioty(List<Przedmiot> przedmioty) {
        this.przedmioty = przedmioty;
    }
}
