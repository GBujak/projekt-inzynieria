package pl.kielce.tu.projektszkola.zajecia;

import pl.kielce.tu.projektszkola.Pracownik;
import pl.kielce.tu.projektszkola.pracownicy.Dyrektor;

public class PlanProxy extends PlanZajec implements ZatwierdzaniePlanu{
    Pracownik pracownik;
    private final PlanZajec plan = PlanZajec.getInstance();

    public PlanProxy(Pracownik pracownik){
        this.pracownik = pracownik;
    }

    @Override
    public void zatwierdzPlan() {
        if(pracownik instanceof Dyrektor)
            plan.czyZatwierdzony = true;
        else
            System.out.println("Nie masz uprawnien do wykonania tej akcji");
    }
}
