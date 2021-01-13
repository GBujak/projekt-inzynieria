package pl.kielce.tu.projektszkola.dydaktyka;
// Grzegorz Bujak

public class MaterialDydaktyczny {
    private String tytul;
    private String zawartosc;
    private Przedmiot przedmiot;

    public MaterialDydaktyczny(String tytul, String zawartosc, Przedmiot przedmiot) {
        this.tytul = tytul;
        this.zawartosc = zawartosc;
        this.przedmiot = przedmiot;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getZawartosc() {
        return zawartosc;
    }

    public void setZawartosc(String zawartosc) {
        this.zawartosc = zawartosc;
    }

    public Przedmiot getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(Przedmiot przedmiot) {
        this.przedmiot = przedmiot;
    }
}
