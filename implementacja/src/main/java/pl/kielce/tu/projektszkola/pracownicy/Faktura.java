package pl.kielce.tu.projektszkola.pracownicy;
//Arkadiusz Markowski

import java.util.Date;

public class Faktura {
    public int numer;
    public int NIP;
    public String przedmiotTransakcji;
    public Integer kwota;
    public Date data;
    public String Sprzedawca;
    public String Nabywca;
    public boolean CzyZatwierdzony;

    public int getNumer(){ return numer; }
    public int getNIP(){ return NIP; }
    public String getPrzedmiotTransakcji(){ return przedmiotTransakcji; }
    public Integer getKwota(){ return kwota; }
    public Date getData(){ return data; }
    public String getSprzedawca(){ return Sprzedawca; }
    public String getNabywca(){ return Nabywca; }
    public boolean getCzyZatwierdzony(){ return CzyZatwierdzony; }

    public void setNumer(int Numer){this.numer = Numer; }
    public void setNIP(int NIP){this.NIP = NIP; }
    public void setPrzedmiotTransakcji(String przedmiotTransakcji){this.przedmiotTransakcji = przedmiotTransakcji; }
    public void setKwota(int kwota){ this.kwota = kwota; }
    public void setData(Date data){ this.data = data; }
    public void setSprzedawca(String Sprzedawca){ this.Sprzedawca = Sprzedawca; }
    public void setNabywca(String Nabywca){ this.Nabywca = Nabywca; }
    public void setCzyZatwierdzony(boolean CzyZatwierdzony){ this.CzyZatwierdzony = CzyZatwierdzony; }
}
