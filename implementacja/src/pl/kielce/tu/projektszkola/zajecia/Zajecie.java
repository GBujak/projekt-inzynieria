package pl.kielce.tu.projektszkola.zajecia;

import pl.kielce.tu.projektszkola.dydaktyka.Klasa;
import pl.kielce.tu.projektszkola.dydaktyka.Przedmiot;

import java.util.Date;

public class Zajecie {
    private final Date data;
    private final Integer czas;
    private final SalaLekcyjna salaLekcyjna;
    private final Klasa klasa;
    private final Przedmiot przedmiot;

    public SalaLekcyjna getSalaLekcyjna(){
        return salaLekcyjna;
    }

    public Zajecie(Date data, Integer czas, SalaLekcyjna sala, Klasa klasa, Przedmiot przedmiot) {
        this.data = data;
        this.czas = czas;
        this.klasa = klasa;
        this.przedmiot = przedmiot;
        salaLekcyjna = sala;
    }

    public Date getData() {
        return data;
    }

    public Integer getCzas() {
        return czas;
    }

    public Klasa getKlasa() {
        return klasa;
    }

    public Przedmiot getPrzedmiot() {
        return przedmiot;
    }

}
