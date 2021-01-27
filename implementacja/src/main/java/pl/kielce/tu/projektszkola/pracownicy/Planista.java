package pl.kielce.tu.projektszkola.pracownicy;

import pl.kielce.tu.projektszkola.Pracownik;
import pl.kielce.tu.projektszkola.zajecia.planzajec.PlanException;
import pl.kielce.tu.projektszkola.zajecia.planzajec.PlanZajec;
import pl.kielce.tu.projektszkola.zajecia.planzajec.PlanZajecImpl;

public class Planista extends Pracownik {

    public void zaplanuj(PlanZajecImpl planZajec) throws PlanException {
        var proxy = PlanZajec.getInstance(this);
        proxy.ustawPlan(planZajec);
    }

}
