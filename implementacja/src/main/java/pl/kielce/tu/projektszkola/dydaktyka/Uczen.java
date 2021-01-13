package pl.kielce.tu.projektszkola.dydaktyka;
// Grzegorz Bujak

import pl.kielce.tu.projektszkola.Uzytkownik;
import pl.kielce.tu.projektszkola.util.TerminZajec;
import pl.kielce.tu.projektszkola.zajecia.Zajecie;
import pl.kielce.tu.projektszkola.zaliczenia.Rozwiazanie;
import pl.kielce.tu.projektszkola.zaliczenia.Test;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Uczen extends Uzytkownik {
    private int numerLegitymacji;
    private Klasa klasa;

    public List<Zajecie> najblizszeZajecia() {
        return klasa.getZajecia().stream()
                .sorted(Comparator.comparing(Zajecie::getData))
                .filter(it -> it.getData().jestPo(TerminZajec.teraz()))
                .collect(Collectors.toList());
    }

    public List<Test> najblizszeTesty() {
        var now = new Date();
        return klasa.getPrzedmioty().stream()
                .flatMap(it -> it.getTesty().stream())
                .sorted(Comparator.comparing(Test::getDataRozpoczecia))
                .filter(it -> it.getDataRozpoczecia().after(now))
                .collect(Collectors.toList());
    }

    public void rozwiazTest(Test test, List<String> odpowiedzi) {
        var rozwiazanie = new Rozwiazanie(test, this, odpowiedzi);
        test.rozwiaz(rozwiazanie);
    }

    public List<Rozwiazanie> mojeRozwiazania() {
        return klasa.getPrzedmioty().stream()
                .flatMap(it -> it.getTesty().stream())
                .map(it -> it.rozwiazanieUcznia(this))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
    }

    public int getNumerLegitymacji() {
        return numerLegitymacji;
    }

    public void setNumerLegitymacji(int numerLegitymacji) {
        this.numerLegitymacji = numerLegitymacji;
    }

    public Klasa getKlasa() {
        return klasa;
    }

    public void setKlasa(Klasa klasa) {
        this.klasa = klasa;
    }
}
