package pl.kielce.tu.projektszkola.pracownicy;

import pl.kielce.tu.projektszkola.Pracownik;

import java.util.List;

public class Ksiegowa extends Pracownik {
    private List<Faktura> faktury;
    private Faktura faktura;

    public List<Faktura> getFaktury() { return faktury; }
    public Faktuera getFaktura(){ return faktura; }
    public void setFaktury(List<Faktura> faktury) { this.faktury=faktury; }
    public void setFaktura(int numer, int NIP, String przedmiotTransakcji, Integer kwota, Date data, String Sprzedawca, String Nabywca, boolean CzyZatwierdzony){
        faktura.numer = numer;
        faktura.NIP = NIP;
        faktura.przedmiotTransakcji = przedmiotTransakcji;
        faktura.kwota = kwota;
        faktura.data = data;
        faktura.Sprzedawca = Sprzedawca;
        faktura.Nabywca =  Nabywca;
        faktura.CzyZatwierdzony =  CzyZatwierdzony;
    }
}
