package pl.kielce.tu.projektszkola.pracownicy;
// Arkadiusz Markowski

public class Leczenie {
    private int nrLegitymacji;
    private String opis;
    private Pielegniarka pielegniarka;

    public String pobierzOpis(int nrLegitymacji){ return opis; }

    public Pielegniarka getPielegniarka() { return pielegniarka; }

    public void setPielegniarka(Pielegniarka pielegniarka) { this.pielegniarka=pielegniarka; }
}
