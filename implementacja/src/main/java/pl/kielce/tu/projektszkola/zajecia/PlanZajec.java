package pl.kielce.tu.projektszkola.zajecia;

import pl.kielce.tu.projektszkola.dydaktyka.Klasa;
import pl.kielce.tu.projektszkola.dydaktyka.Przedmiot;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;

public class PlanZajec {
    // string - nazwa klasy
    HashMap<String, HashMap<DayOfWeek, List<Zajecie>>> plan;
    private boolean czyZrobiony;
    private boolean czyZatwierdzony;

    public PlanZajec( HashMap<String, HashMap<DayOfWeek, List<Zajecie>>> plan) {
        this.plan = plan;
    }

    public void wyswietl(){
        if(czyZrobiony && czyZatwierdzony){
            //implementacja wyswietlania planu
        }
        else{
            //wyswietl komunikat "plan nie jest gotowy"
        }
    }

    public void setCzyZrobiony(boolean czyZrobiony) {
        this.czyZrobiony = czyZrobiony;
    }

    public void setCzyZatwierdzony(boolean czyZatwierdzony) {
        this.czyZatwierdzony = czyZatwierdzony;
    }

    public boolean isCzyZatwierdzony() {
        return czyZatwierdzony;
    }

    public boolean isCzyZrobiony() {
        return czyZrobiony;
    }

}
