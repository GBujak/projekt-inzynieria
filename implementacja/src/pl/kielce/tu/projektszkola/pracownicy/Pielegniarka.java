package pl.kielce.tu.projektszkola.pracownicy;
// Arkadiusz Markowski

import pl.kielce.tu.projektszkola.Pracownik;

import java.util.List;

public class Pielegniarka extends Pracownik {
    private List<Leczenie> leczenia;

    public List<Leczenie> getLeczenie(){ return leczenia; }

    public void setLeczenia(List<Leczenie> leczenia){ this.leczenia=leczenia; }
}
