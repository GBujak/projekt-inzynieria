package pl.kielce.tu.projektszkola.zajecia.planzajec;

import pl.kielce.tu.projektszkola.Uzytkownik;
import pl.kielce.tu.projektszkola.dydaktyka.Klasa;
import pl.kielce.tu.projektszkola.zajecia.Zajecie;

import java.time.DayOfWeek;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PlanZajecImpl implements PlanZajec {
    static PlanZajecImpl plan;

    // string - nazwa klasy
    Map<String, Map<DayOfWeek, List<Zajecie>>> terminyZajec;
    protected boolean czyZrobiony;
    protected boolean czyZatwierdzony;

    public void ustawTerminy( Map<String, Map<DayOfWeek, List<Zajecie>>> terminyZajec) {
        this.terminyZajec = terminyZajec;
    }

    //get singleton
    public static PlanZajec getInstance(Uzytkownik uzytkownik) {
        if(plan == null) {
            plan = new PlanZajecImpl();
        }

        return new PlanProxy(uzytkownik, plan);
    }

    @Override
    public void zatwierdzPlan() {
        this.czyZatwierdzony = true;
    }

    @Override
    public void ustawPlan(PlanZajecImpl nowyPlan) {
        plan = nowyPlan;
    }

    public void wyswietl() throws PlanException {
        if(!czyZrobiony || !czyZatwierdzony){
            throw new PlanException("Plan nie jest jeszcze gotowy.");
        }
    }

    public void setCzyZrobiony(boolean czyZrobiony) {
        this.czyZrobiony = czyZrobiony;
    }

    public boolean isCzyZatwierdzony() {
        return czyZatwierdzony;
    }

    public boolean isCzyZrobiony() {
        return czyZrobiony;
    }

    public Map<DayOfWeek, List<Zajecie>> zajeciaKlasy(Klasa klasa) {
        return terminyZajec.get(klasa.getNazwa());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlanZajecImpl planZajec = (PlanZajecImpl) o;
        return Objects.equals(terminyZajec, planZajec.terminyZajec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(terminyZajec);
    }

    @Override
    public String toString() {
        return "PlanZajec{" +
                "terminyZajec=" + terminyZajec +
                '}';
    }
}
