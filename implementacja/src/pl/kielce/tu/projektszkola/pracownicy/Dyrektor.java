package pl.kielce.tu.projektszkola.pracownicy;

import pl.kielce.tu.projektszkola.Pracownik;

import java.util.List;

public class Dyrektor extends Pracownik {
    private List<Faktura> faktury;

    public List<Faktura> getFaktury() { return faktury; }

    public void setFaktury(List<Faktura> faktury) { this.faktury=faktury; }
}
