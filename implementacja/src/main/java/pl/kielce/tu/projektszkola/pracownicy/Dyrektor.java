package pl.kielce.tu.projektszkola.pracownicy;
//Arkadiusz Markowski
import pl.kielce.tu.projektszkola.Pracownik;

import java.util.List;

public class Dyrektor extends Pracownik {
    private Ksiegowa ksiegowa;
    private Faktura faktura;
    private Planista planista;

    public List<Faktura> getFaktury() { return ksiegowa.getFaktury(); }
    public void zatwierdzFakture() { ksiegowa.getFaktura().setCzyZatwierdzony(true); }
    public void zatwierdzPlan(){
        planista.getPlan().setCzyZatwierdzony(true);
    }
}
