package pl.kielce.tu.projektszkola.pracownicy;

import pl.kielce.tu.projektszkola.Pracownik;
import pl.kielce.tu.projektszkola.zajecia.PlanZajec;

public class Planista extends Pracownik {

    private PlanZajec plan;

    public void zaplanuj(){
        plan = new PlanZajec();
        //implementacja tworzenia planu
        // (przy tworzeniu planu mozna zastosowac wzorzec Buildera)
        plan.setCzyZrobiony(true);
    }

    public PlanZajec getPlan() {
        return plan;
    }
}
