package pl.kielce.tu.projektszkola.zajecia;
// Grzegorz Bujak

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

class PlanZajecBuilderZajecie {
    public String nazwaPrzedmiotu;
    public String nazwaKlasy;
    public DayOfWeek dzienTygodnia;
    public LocalTime godzina;
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

    public PlanZajecBuilder zZajeciem(LocalTime czas, String nazwaPrzedmiotu) {
        if (ustawionaNazwaKlasy == null)
            throw new IllegalStateException("Builder: nieustawiona nazwa klasy");
        if (ustawionyDzienTygodnia == null)
            throw new IllegalStateException("Builder: nieustawiony dzien tygodnia");

        for (var zajecieZPlanu: tworzonyPlan) {
            if (zajecieZPlanu.dzienTygodnia.equals(ustawionyDzienTygodnia)
             && zajecieZPlanu.nazwaKlasy.equals(ustawionaNazwaKlasy)
             && zajecieZPlanu.godzina.getHour() == czas.getHour())
                throw new IllegalStateException("Builder: zajęcia się pokrywają");
        }

        var zajecie = new PlanZajecBuilderZajecie();
        zajecie.nazwaKlasy = ustawionaNazwaKlasy;
        zajecie.dzienTygodnia = ustawionyDzienTygodnia;
        zajecie.godzina = czas;
        zajecie.nazwaPrzedmiotu = nazwaPrzedmiotu;

        tworzonyPlan.add(zajecie);

        return this;
    }

    public PlanZajec buduj() {
        var planZajec = new PlanZajec();



        return planZajec;
    }
}
