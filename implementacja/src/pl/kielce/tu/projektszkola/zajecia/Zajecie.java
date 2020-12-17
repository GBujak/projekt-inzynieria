package pl.kielce.tu.projektszkola.zajecia;

import pl.kielce.tu.projektszkola.dydaktyka.Klasa;
import pl.kielce.tu.projektszkola.dydaktyka.Przedmiot;
import pl.kielce.tu.projektszkola.zaliczenia.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Zajecie {
    private Date data;
    private Integer czas;
    private SalaLekcyjna salaLekcyjna;
    private Klasa klasa;
    private Przedmiot przedmiot;

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

    public void setData(Date data) {
        this.data = data;
    }

    public Integer getCzas() {
        return czas;
    }

    public void setCzas(Integer czas) {
        this.czas = czas;
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
