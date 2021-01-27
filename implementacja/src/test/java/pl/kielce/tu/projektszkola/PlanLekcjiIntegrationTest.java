package pl.kielce.tu.projektszkola;

import org.junit.jupiter.api.Test;
import pl.kielce.tu.projektszkola.dydaktyka.Klasa;
import pl.kielce.tu.projektszkola.dydaktyka.Nauczyciel;
import pl.kielce.tu.projektszkola.dydaktyka.Przedmiot;
import pl.kielce.tu.projektszkola.dydaktyka.Uczen;
import pl.kielce.tu.projektszkola.pracownicy.Dyrektor;
import pl.kielce.tu.projektszkola.pracownicy.Planista;
import pl.kielce.tu.projektszkola.zajecia.PlanZajecBuilder;
import pl.kielce.tu.projektszkola.zajecia.SalaLekcyjna;

import java.time.DayOfWeek;
import java.util.List;

public class PlanLekcjiIntegrationTest {
    @Test
    void planLekcjiIntegrationTest() {
        var planista = new Planista();
        var dyrektor = new Dyrektor();
        var uczen = new Uczen();

        var nauczyciel = new Nauczyciel();
        var klasa = new Klasa("11a", 15, nauczyciel);

        klasa.setUczniowie(List.of(uczen));
        uczen.setKlasa(klasa);

        var salaLekcyjna = new SalaLekcyjna(20, "3.14");

        var przedmiot = new Przedmiot();
        przedmiot.setNazwa("angielski");

        var planBuilder = new PlanZajecBuilder();
        var plan = planBuilder
                .zDniemTygodnia(DayOfWeek.MONDAY)
                .wSaliLekcyjnej(salaLekcyjna)
                .zCzasemTrwania(45)
                .zPrzedmiotu(przedmiot)
                .zKlasa(klasa)
                .zZajeciem(12, 30)
                .buduj();

        planista.zaplanuj(plan);
        dyrektor.zatwierdzPlan();

        System.out.println(uczen.getKlasa().getZajecia());
    }
}
