package pl.kielce.tu.projektszkola.zajecia;

import pl.kielce.tu.projektszkola.Uzytkownik;
import pl.kielce.tu.projektszkola.dydaktyka.Uczen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class SpotkanieOnline {
    private Integer id;
    private String nazwa;
    private Zajecie zajecie;
    private List<Uzytkownik> uczestnicy;
    private Zaproszenie zaproszenie;

    public SpotkanieOnline(){

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

    public void stworzZaproszenia()
    {
        List<String> adresyEmail = new ArrayList<String>();

        for(Uczen u : zajecie.getKlasa().getUczniowie())
        {
            adresyEmail.add(u.getAdres());
        }

        zaproszenie = new Zaproszenie(id, nazwa, adresyEmail);
    }
}
