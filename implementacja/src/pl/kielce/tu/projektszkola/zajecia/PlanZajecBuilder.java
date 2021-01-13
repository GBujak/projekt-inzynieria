package pl.kielce.tu.projektszkola.zajecia;
// Grzegorz Bujak

import pl.kielce.tu.projektszkola.util.TerminZajec;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

class PlanZajecBuilderZajecie {
    public String nazwaPrzedmiotu;
    public String nazwaKlasy;
    public TerminZajec terminZajecia;
}

public class PlanZajecBuilder {
    private String ustawionaNazwaKlasy;
    private DayOfWeek ustawionyDzienTygodnia;
    private List<PlanZajecBuilderZajecie> tworzonyPlan = new ArrayList<>();

    public PlanZajecBuilder zNazwaKlasy(String nazwa) {
        this.ustawionaNazwaKlasy = nazwa;
        return this;
    }

    public PlanZajecBuilder zDniemTygodnia(DayOfWeek dzien) {
        this.ustawionyDzienTygodnia = dzien;
        return this;
    }

    public PlanZajecBuilder zZajeciem(int godzina, int minuta, String nazwaPrzedmiotu) {
        if (ustawionaNazwaKlasy == null)
            throw new IllegalStateException("Builder: nieustawiona nazwa klasy");
        if (ustawionyDzienTygodnia == null)
            throw new IllegalStateException("Builder: nieustawiony dzien tygodnia");

        var nowyTermin = new TerminZajec(this.ustawionyDzienTygodnia, godzina, minuta);

        for (var zajecieZPlanu: tworzonyPlan) {
            if (zajecieZPlanu.nazwaKlasy.equals(this.ustawionaNazwaKlasy)
             && zajecieZPlanu.terminZajecia.pokrywaSie(nowyTermin))
                throw new IllegalStateException("Builder: zajęcia się pokrywają");
        }

        var zajecie = new PlanZajecBuilderZajecie();
        zajecie.nazwaKlasy = ustawionaNazwaKlasy;
        zajecie.terminZajecia = nowyTermin;
        zajecie.nazwaPrzedmiotu = nazwaPrzedmiotu;

        tworzonyPlan.add(zajecie);

        return this;
    }

    public PlanZajec buduj() {
        var planZajec = new PlanZajec();



        return planZajec;
    }
}
