package pl.kielce.tu.projektszkola.dydaktyka;
// Grzegorz Bujak

import pl.kielce.tu.projektszkola.zajecia.planzajec.PlanZajec;
import pl.kielce.tu.projektszkola.zajecia.planzajec.PlanZajecImpl;
import pl.kielce.tu.projektszkola.zajecia.Zajecie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Klasa {
    private String nazwa;
    private int rozmiarGrupy;
    private Nauczyciel nauczyciel;

    private List<Uczen> uczniowie = new ArrayList<>();
    private List<Przedmiot> przedmioty = new ArrayList<>();

    public Klasa(String nazwa, int rozmiarGrupy, Nauczyciel nauczyciel) {
        this.nazwa = nazwa;
        this.rozmiarGrupy = rozmiarGrupy;
        this.nauczyciel = nauczyciel;
    }

    public List<Zajecie> getZajecia() {
        return PlanZajec.getInstance(null).zajeciaKlasy(this)
                .values().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klasa klasa = (Klasa) o;
        return Objects.equals(nazwa, klasa.nazwa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa);
    }
}
