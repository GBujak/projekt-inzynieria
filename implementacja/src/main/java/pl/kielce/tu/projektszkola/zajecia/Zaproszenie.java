package pl.kielce.tu.projektszkola.zajecia;

import pl.kielce.tu.projektszkola.dydaktyka.Uczen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Zaproszenie {

    private Integer spotkanieId;
    private String nazwa;
    protected List<String> adresyEmail;

    public Zaproszenie()
    {}

    public Zaproszenie(Integer spotkanieId, String nazwa, List<String> adresyEmail)
    {
        this.spotkanieId = spotkanieId;
        this.nazwa = nazwa;
        this.adresyEmail = adresyEmail;
    }

    public void send()
    {
    }
}
