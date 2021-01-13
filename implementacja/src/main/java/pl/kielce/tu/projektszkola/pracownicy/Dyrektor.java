package pl.kielce.tu.projektszkola.pracownicy;
//Arkadiusz Markowski
import pl.kielce.tu.projektszkola.Pracownik;
import pl.kielce.tu.projektszkola.zajecia.PlanProxy;
import pl.kielce.tu.projektszkola.zajecia.ZatwierdzaniePlanu;

import java.util.List;

public class Dyrektor extends Pracownik {
    private Ksiegowa ksiegowa;
    private Faktura faktura;

    public List<Faktura> getFaktury() { return ksiegowa.getFaktury(); }
    public void zatwierdzFakture() { ksiegowa.getFaktura().setCzyZatwierdzony(true); }

    public void zatwierdzPlan(){
        ZatwierdzaniePlanu plan = new PlanProxy(this);
        plan.zatwierdzPlan();
    }
}
