package pl.kielce.tu.projektszkola.dydaktyka;
// Grzegorz Bujak

import java.util.List;

public class Przedmiot {
    private String nazwa;

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
}
