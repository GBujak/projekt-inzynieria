package pl.kielce.tu.projektszkola.zajecia;

import pl.kielce.tu.projektszkola.dydaktyka.Klasa;
import pl.kielce.tu.projektszkola.dydaktyka.Przedmiot;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;

public class PlanZajec {

    private Klasa klasa; //ktorej klasy dotyczy ten plan

    HashMap< List<DayOfWeek>, List<LocalTime> > dniGodziny = new HashMap<>();
    HashMap< HashMap< List<DayOfWeek>, List<LocalTime>>, List<Przedmiot> > dniGodzinyPrzedmioty = new HashMap<>();

    private boolean czyZrobiony;
    private boolean czyZatwierdzony;

    public void zapisz(Klasa klasa, List<DayOfWeek> dni, List<LocalTime> godziny, List<Przedmiot> przedmioty){
        this.klasa = klasa;
        dniGodziny.put(dni, godziny);
        dniGodzinyPrzedmioty.put(dniGodziny, przedmioty);
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

    public Klasa getKlasa() {
        return klasa;
    }
}
