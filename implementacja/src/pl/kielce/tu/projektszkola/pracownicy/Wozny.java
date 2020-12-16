package pl.kielce.tu.projektszkola.pracownicy;

import pl.kielce.tu.projektszkola.Pracownik;
import pl.kielce.tu.projektszkola.zajecia.SalaLekcyjna;

import java.util.Date;

public class Wozny extends Pracownik {

    public void posprzataj(SalaLekcyjna sala){
        Date data = new Date();
        sala.setOstatnioSprzatana(data);
    }
}
