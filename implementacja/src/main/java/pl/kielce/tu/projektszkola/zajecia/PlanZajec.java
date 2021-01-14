package pl.kielce.tu.projektszkola.zajecia;

import java.time.DayOfWeek;
import java.util.HashMap;
import java.util.List;

public class PlanZajec {
    //singleton
    private static PlanZajec plan;

    // string - nazwa klasy
    HashMap<String, HashMap<DayOfWeek, List<Zajecie>>> terminyZajec;
    protected boolean czyZrobiony;
    protected boolean czyZatwierdzony;

    public void ustawTerminy( HashMap<String, HashMap<DayOfWeek, List<Zajecie>>> terminyZajec) {
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
}
