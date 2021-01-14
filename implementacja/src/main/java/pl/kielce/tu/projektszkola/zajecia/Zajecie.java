package pl.kielce.tu.projektszkola.zajecia;

import pl.kielce.tu.projektszkola.dydaktyka.Klasa;
import pl.kielce.tu.projektszkola.dydaktyka.Przedmiot;
import pl.kielce.tu.projektszkola.util.TerminZajec;

import java.util.Objects;

public class Zajecie {
    private TerminZajec data;
    private Integer czasTrwania;
    private SalaLekcyjna salaLekcyjna;
    private Klasa klasa;
    private Przedmiot przedmiot;

    public SalaLekcyjna getSalaLekcyjna(){
        return salaLekcyjna;
    }

    public Zajecie(TerminZajec data, Integer czasTrwania, SalaLekcyjna sala, Klasa klasa, Przedmiot przedmiot) {
        this.data = data;
        this.czasTrwania = czasTrwania;
        this.klasa = klasa;
        this.przedmiot = przedmiot;
        salaLekcyjna = sala;
    }

    public TerminZajec getData() {
        return data;
    }

    public void setData(TerminZajec data) {
        this.data = data;
    }

    public Integer getCzasTrwania() {
        return czasTrwania;
    }

    public void setCzasTrwania(Integer czasTrwania) {
        this.czasTrwania = czasTrwania;
    }

    public void setSalaLekcyjna(SalaLekcyjna salaLekcyjna) {
        this.salaLekcyjna = salaLekcyjna;
    }

    public Klasa getKlasa() {
        return klasa;
    }

    public void setKlasa(Klasa klasa) {
        this.klasa = klasa;
    }

    public Przedmiot getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(Przedmiot przedmiot) {
        this.przedmiot = przedmiot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zajecie zajecie = (Zajecie) o;
        return Objects.equals(data, zajecie.data) && Objects.equals(czasTrwania, zajecie.czasTrwania) && Objects.equals(salaLekcyjna, zajecie.salaLekcyjna) && Objects.equals(klasa, zajecie.klasa) && Objects.equals(przedmiot, zajecie.przedmiot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, czasTrwania, salaLekcyjna, klasa, przedmiot);
    }

    @Override
    public String toString() {
        return "Zajecie{" +
                "data=" + data +
                ", czasTrwania=" + czasTrwania +
                ", salaLekcyjna=" + salaLekcyjna +
                ", klasa=" + klasa +
                ", przedmiot=" + przedmiot +
                '}';
    }
}
