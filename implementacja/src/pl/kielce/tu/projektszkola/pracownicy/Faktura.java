package pl.kielce.tu.projektszkola.pracownicy;
//Arkadiusz Markowski

import java.util.Date;

public class Faktura {
    private int numer;
    private int NIP;
    private String przedmiotTransakcji;
    private Integer kwota;
    private Date data;
    private String Sprzedawca;
    private String Nabywca;

    public int getNumer(){ return numer; }
    public int getNIP(){ return NIP; }
    public String getPrzedmiotTransakcji(){ return przedmiotTransakcji; }
    public Integer getKwota(){ return kwota; }
    public Date getData(){ return data; }
    public String getSprzedawca(){ return Sprzedawca; }
    public String getNabywca(){ return Nabywca; }

    public int setNumer(int Numer){this.numer = Numer; }
    public int setNIP(int NIP){this.NIP = NIP; }
    public String setPrzedmiotTransakcji(String przedmiotTransakcji){this.przedmiotTransakcji = przedmiotTransakcji; }
    public int setKwota(int kwota){ this.kwota = kwota; }
    public Date setData(Date data){ this.data = data; }
    public String setSprzedawca(String Sprzedawca){ this.Sprzedawca = Sprzedawca; }
    public String setNabywca(String Nabywca){ this.Nabywca = Nabywca; }
}
