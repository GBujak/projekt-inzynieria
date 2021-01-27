package pl.kielce.tu.projektszkola.zajecia.planzajec;

import pl.kielce.tu.projektszkola.Pracownik;
import pl.kielce.tu.projektszkola.Uzytkownik;
import pl.kielce.tu.projektszkola.dydaktyka.Klasa;
import pl.kielce.tu.projektszkola.pracownicy.Dyrektor;
import pl.kielce.tu.projektszkola.pracownicy.Planista;
import pl.kielce.tu.projektszkola.zajecia.Zajecie;
import pl.kielce.tu.projektszkola.zajecia.ZatwierdzaniePlanu;

import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PlanProxy implements PlanZajec {
    private Uzytkownik uzytkownik;
    private PlanZajecImpl planZajec;

    public PlanProxy(Uzytkownik uzytkownik, PlanZajecImpl planZajec) {
        this.uzytkownik = uzytkownik;
        this.planZajec = planZajec;
    }

    @Override
    public void zatwierdzPlan() throws PlanException {
        if (uzytkownik instanceof Dyrektor)
            planZajec.zatwierdzPlan();
        else throw new PlanException("Zatwierdzanie planu nie przez dyrektora");
    }

    public Map<DayOfWeek, List<Zajecie>> zajeciaKlasy(Klasa klasa) {
        return planZajec.zajeciaKlasy(klasa);
    }

    @Override
    public void ustawPlan(PlanZajecImpl nowyPlan) throws PlanException {
        if (uzytkownik instanceof Planista)
            planZajec.ustawPlan(nowyPlan);
        else throw new PlanException("Nie-planista ustawia plan");
    }

    @Override
    public boolean isCzyZatwierdzony() {
        return planZajec.isCzyZatwierdzony();
    }

    @Override
    public boolean equals(Object o) {
        return planZajec.equals(o);
    }

    @Override
    public int hashCode() {
        return planZajec.hashCode();
    }

    @Override
    public String toString() {
        return planZajec.toString();
    }
}
