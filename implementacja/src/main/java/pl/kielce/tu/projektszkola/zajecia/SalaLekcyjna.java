package pl.kielce.tu.projektszkola.zajecia;

import java.util.Date;
import java.util.Objects;

public class SalaLekcyjna {
    private final Integer iloscMiejsc;
    private final String nazwa;

    private Date ostatnioSprzatana;

    public SalaLekcyjna(Integer iloscMiejsc, String nazwa){
            this.iloscMiejsc = iloscMiejsc;
            this.nazwa = nazwa;
    }

    public void setOstatnioSprzatana(Date ostatnioSprzatana) {
        this.ostatnioSprzatana = ostatnioSprzatana;
    }

    public Integer getIloscMiejsc() {
        return iloscMiejsc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public Date getOstatnioSprzatana() {
        return ostatnioSprzatana;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalaLekcyjna that = (SalaLekcyjna) o;
        return Objects.equals(nazwa, that.nazwa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa);
    }
}
