package pl.kielce.tu.projektszkola.pracownicy;

public class Faktura {
    private String numer;
    private String NIP;
    private String przedmiotTransakcji;
    private Integer kwota;

    public String getNumer(){ return numer; }

    public String getNIP(){ return NIP; }

    public String getPrzedmiotTransakcji(){ return przedmiotTransakcji; }

    public Integer getKwota(){ return kwota; }

    public void zatwierdz(){}

    public void odrzuc(){}
}
