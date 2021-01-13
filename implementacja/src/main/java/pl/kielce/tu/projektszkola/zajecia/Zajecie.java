package pl.kielce.tu.projektszkola.zajecia;

import pl.kielce.tu.projektszkola.dydaktyka.Klasa;
import pl.kielce.tu.projektszkola.dydaktyka.Przedmiot;
import pl.kielce.tu.projektszkola.util.TerminZajec;

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
}
