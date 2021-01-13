package pl.kielce.tu.projektszkola.pracownicy;
// Arkadiusz Markowski

import java.util.Date;

public class Leczenie {
    private int nrLegitymacji;
    private Date data;
    private String opis;
    private Pielegniarka pielegniarka;

    public void setNrLegitymacji(int nrLegitymacji) {this.nrLegitymacji = nrLegitymacji; }
    public void setData(Date Data) {this.data = Data; }
    public void setOpis(String Opis) {this.opis = Opis; }
    public void setPielegniarka(Pielegniarka pielegniarka) { this.pielegniarka=pielegniarka; }
    public String pobierzOpis(int nrLegitymacji){ return opis; }
    public Pielegniarka getPielegniarka() { return pielegniarka; }
}
