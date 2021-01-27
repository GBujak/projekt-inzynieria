package pl.kielce.tu.projektszkola.zajecia.planzajec;

import pl.kielce.tu.projektszkola.Uzytkownik;
import pl.kielce.tu.projektszkola.dydaktyka.Klasa;
import pl.kielce.tu.projektszkola.zajecia.Zajecie;

import java.time.DayOfWeek;
import java.util.List;
import java.util.Map;

public interface PlanZajec {
    static PlanZajec getInstance(Uzytkownik uzytkownik) {
        return PlanZajecImpl.getInstance(uzytkownik);
    }

    void zatwierdzPlan() throws PlanException;
    boolean isCzyZatwierdzony();
    void ustawPlan(PlanZajecImpl nowyPlan) throws PlanException;

    Map<DayOfWeek, List<Zajecie>> zajeciaKlasy(Klasa klasa);
}
