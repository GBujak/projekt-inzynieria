package pl.kielce.tu.projektszkola.pracownicy;

import pl.kielce.tu.projektszkola.Pracownik;
import pl.kielce.tu.projektszkola.zajecia.PlanZajec;

public class Planista extends Pracownik {

    private PlanZajec plan;

    public void zaplanuj(){
        // uzywaj planzajecbuilder
    }

    public PlanZajec getPlan() {
        return plan;
    }
}
