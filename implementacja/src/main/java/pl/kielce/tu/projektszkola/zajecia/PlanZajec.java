package pl.kielce.tu.projektszkola.zajecia;

import pl.kielce.tu.projektszkola.dydaktyka.Klasa;

import java.time.DayOfWeek;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PlanZajec {
    //singleton
    private static PlanZajec plan;

    // string - nazwa klasy
    Map<String, Map<DayOfWeek, List<Zajecie>>> terminyZajec;
    protected boolean czyZrobiony;
    protected boolean czyZatwierdzony;

    public void ustawTerminy( Map<String, Map<DayOfWeek, List<Zajecie>>> terminyZajec) {
        this.terminyZajec = terminyZajec;
    }

    //get singleton
    public static PlanZajec getInstance(){
        if(plan == null) {
            plan = new PlanZajec();
        }
        return plan;
    }

    public void wyswietl(){
        if(czyZrobiony && czyZatwierdzony){
            System.out.println("Zawartosc planu: ");
        }
        else{
            System.out.println("Plan nie jest jeszcze gotowy!");
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
        PlanZajec planZajec = (PlanZajec) o;
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
