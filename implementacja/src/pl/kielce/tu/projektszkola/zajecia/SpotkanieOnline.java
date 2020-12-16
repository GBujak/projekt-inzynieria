package pl.kielce.tu.projektszkola.zajecia;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import pl.kielce.tu.projektszkola.Uzytkownik;

public class SpotkanieOnline {
    private Integer id;
    private String nazwa;
    private Zajecie zajecie;
    private List<Uzytkownik> uczestnicy;
    private final Random rd;

    public SpotkanieOnline(){
        rd = new Random();
    }

    public void dolacz(Uzytkownik uzytkownik){
        uczestnicy.add(uzytkownik);
    }

    public void zakoncz() {}

    public SpotkanieOnline utworz(String nazwa, Zajecie zajecie){
        Random rd = new Random();
    	id = rd.nextInt();
        this.zajecie = zajecie;
        uczestnicy = new ArrayList<>(uczestnicy);
        setNazwa(nazwa);
        return this;
    }

    public Integer getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public Zajecie getZajecie() {
        return zajecie;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
