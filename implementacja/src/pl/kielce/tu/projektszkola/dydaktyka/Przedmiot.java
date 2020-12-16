package pl.kielce.tu.projektszkola.dydaktyka;
// Grzegorz Bujak

import java.util.Date;
import java.util.List;

import pl.kielce.tu.projektszkola.zaliczenia.ITest;
import pl.kielce.tu.projektszkola.zaliczenia.Test;

public class Przedmiot {
    private String nazwa;
    private ITest test;

    private List<MaterialDydaktyczny> materialy;
    private List<Nauczyciel> nauczyciele;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public List<MaterialDydaktyczny> getMaterialy() {
        return materialy;
    }

    public void setMaterialy(List<MaterialDydaktyczny> materialy) {
        this.materialy = materialy;
    }

    public List<Nauczyciel> getNauczyciele() {
        return nauczyciele;
    }

    public void setNauczyciele(List<Nauczyciel> nauczyciele) {
        this.nauczyciele = nauczyciele;
    }

    public void dodajTest(String id, Date dataRozpoczecia, int limitCzasu, List<String> pytania)
    {
    	test = new Test(id, dataRozpoczecia, limitCzasu, pytania);
    }
}
