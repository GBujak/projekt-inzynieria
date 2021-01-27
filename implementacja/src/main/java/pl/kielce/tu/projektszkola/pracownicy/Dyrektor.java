package pl.kielce.tu.projektszkola.pracownicy;
//Arkadiusz Markowski
import pl.kielce.tu.projektszkola.Pracownik;
import pl.kielce.tu.projektszkola.zajecia.planzajec.PlanProxy;
import pl.kielce.tu.projektszkola.zajecia.ZatwierdzaniePlanu;

import java.util.List;

public class Dyrektor extends Pracownik {
    private Ksiegowa ksiegowa;
    private Faktura faktura;

    public List<Faktura> getFaktury() { return ksiegowa.getFaktury(); }
    public void zatwierdzFakture() { ksiegowa.getFaktura().setCzyZatwierdzony(true); }

    public void zatwierdzPlan(){
    }
}
