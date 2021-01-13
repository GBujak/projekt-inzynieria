package pl.kielce.tu.projektszkola.util;

import java.time.DayOfWeek;

public class TerminZajec {
    private DayOfWeek dzienTygodnia;
    private int godzina;
    private int minuta;

    public TerminZajec(DayOfWeek dzienTygodnia, int godzina, int minuta) {
        if (godzina < 0 || godzina > 23) throw new IllegalStateException("Niepoprawna godzina: " + godzina);
        if (minuta < 0 || minuta > 59) throw new IllegalStateException("Niepoprawna minuta: " + minuta);

        this.dzienTygodnia = dzienTygodnia;
        this.godzina = godzina;
        this.minuta = minuta;
    }

    public DayOfWeek getDzienTygodnia() {
        return dzienTygodnia;
    }

    public int getGodzina() {
        return godzina;
    }

    public int getMinuta() {
        return minuta;
    }

    public boolean pokrywaSie(TerminZajec innyTermin) {
        if (!dzienTygodnia.equals(innyTermin.getDzienTygodnia())) return false;

        var minuty = minuta + 60 * godzina;
        var innyMinuty = innyTermin.getMinuta() + 60 * innyTermin.getGodzina();

        return Math.abs(minuty - innyMinuty) <= 45;
    }
}
