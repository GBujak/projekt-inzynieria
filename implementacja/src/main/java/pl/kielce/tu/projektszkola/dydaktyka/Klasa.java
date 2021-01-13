package pl.kielce.tu.projektszkola.dydaktyka;
// Grzegorz Bujak

import pl.kielce.tu.projektszkola.zajecia.Zajecie;

import java.util.ArrayList;
import java.util.List;

public class Klasa {
    private String nazwa;
    private int rozmiarGrupy;
    private Nauczyciel nauczyciel;

    private List<Uczen> uczniowie = new ArrayList<>();
    private List<Przedmiot> przedmioty = new ArrayList<>();
    private List<Zajecie> zajecia = new ArrayList<>();

    public Klasa(String nazwa, int rozmiarGrupy, Nauczyciel nauczyciel) {
        this.nazwa = nazwa;
        this.rozmiarGrupy = rozmiarGrupy;
        this.nauczyciel = nauczyciel;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getRozmiarGrupy() {
        return rozmiarGrupy;
    }

    public void setRozmiarGrupy(int rozmiarGrupy) {
        this.rozmiarGrupy = rozmiarGrupy;
    }

    public List<Uczen> getUczniowie() {
        return uczniowie;
    }

    public void setUczniowie(List<Uczen> uczniowie) {
        this.uczniowie = uczniowie;
    }

    public Nauczyciel getNauczyciel() {
        return nauczyciel;
    }

    public void setNauczyciel(Nauczyciel nauczyciel) {
        this.nauczyciel = nauczyciel;
    }

    public List<Przedmiot> getPrzedmioty() {
        return przedmioty;
    }

    public void setPrzedmioty(List<Przedmiot> przedmioty) {
        this.przedmioty = przedmioty;
    }

    public List<Zajecie> getZajecia() {
        return zajecia;
    }

    public void setZajecia(List<Zajecie> zajecia) {
        this.zajecia = zajecia;
    }
}
