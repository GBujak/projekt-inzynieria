package pl.kielce.tu.projektszkola.dydaktyka;
// Grzegorz Bujak

import pl.kielce.tu.projektszkola.Pracownik;
import pl.kielce.tu.projektszkola.util.TerminZajec;
import pl.kielce.tu.projektszkola.zajecia.Zajecie;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Nauczyciel extends Pracownik {
    private String specjalizacja;
    private List<Klasa> klasy = new ArrayList<>();
    private List<Przedmiot> przedmioty = new ArrayList<>();

    public List<Zajecie> najblizszeZajecia() {
        return klasy.stream()
                .flatMap(it -> it.getZajecia().stream())
                .sorted(Comparator.comparing(Zajecie::getData))
                .filter(it -> it.getData().jestPo(TerminZajec.teraz()))
                .collect(Collectors.toList());
    }

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
