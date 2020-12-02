package pl.kielce.tu.projektszkola.zajecia;

import java.util.Date;

public class SalaLekcyjna {
    private Integer iloscMiejsc;
    private String nazwa;
    private Date ostatnioSprzatana;

    public Integer getIloscMiejsc() {
        return iloscMiejsc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public Date getOstatnioSprzatana() {
        return ostatnioSprzatana;
    }

    public void setIloscMiejsc(Integer iloscMiejsc) {
        this.iloscMiejsc = iloscMiejsc;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
