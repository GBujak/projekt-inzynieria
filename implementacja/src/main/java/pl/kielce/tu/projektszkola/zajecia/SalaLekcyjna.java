package pl.kielce.tu.projektszkola.zajecia;

import java.util.Date;

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
}
