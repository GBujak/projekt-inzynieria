package pl.kielce.tu.projektszkola.dydaktyka;
// Grzegorz Bujak

import java.util.List;

public class Klasa {
    private String nazwa;
    private int rozmiarGrupy;

    private List<Uczen> uczniowie;
    private Nauczyciel nauczyciel;
    private List<Przedmiot> przedmioty;

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
}
