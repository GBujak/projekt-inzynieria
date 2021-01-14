package pl.kielce.tu.projektszkola;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import pl.kielce.tu.projektszkola.dydaktyka.Klasa;
import pl.kielce.tu.projektszkola.dydaktyka.Nauczyciel;
import pl.kielce.tu.projektszkola.dydaktyka.Przedmiot;
import pl.kielce.tu.projektszkola.util.TerminZajec;
import pl.kielce.tu.projektszkola.zajecia.PlanZajec;
import pl.kielce.tu.projektszkola.zajecia.PlanZajecBuilder;
import pl.kielce.tu.projektszkola.zajecia.SalaLekcyjna;
import pl.kielce.tu.projektszkola.zajecia.Zajecie;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.List;
import java.util.Map;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PlanZajecBuilderTest {
    Klasa klasa1, klasa2;
    Przedmiot przedmiot;
    SalaLekcyjna salaLekcyjna1, salaLekcyjna2;

    @BeforeAll
    void setup() {
        klasa1 = new Klasa("11a", 15, new Nauczyciel());
        klasa2 = new Klasa("11b", 15, new Nauczyciel());

        przedmiot = new Przedmiot();

        salaLekcyjna1 = new SalaLekcyjna(30, "3.10");
        salaLekcyjna2 = new SalaLekcyjna(30, "3.11");
    }

    @Test
    void pokrywaSieTest() {
        var builder = new PlanZajecBuilder();
        builder.zKlasa(klasa1)
                .zDniemTygodnia(DayOfWeek.MONDAY)
                .zCzasemTrwania(45)
                .zPrzedmiotu(przedmiot)
                .wSaliLekcyjnej(salaLekcyjna1);

        builder.zZajeciem(10, 45);

        Assertions.assertThrows(
                IllegalStateException.class,
                () -> builder.zZajeciem(11, 30)
        );

        Assertions.assertDoesNotThrow(
                () -> builder.zDniemTygodnia(DayOfWeek.TUESDAY)
                    .zZajeciem(11, 30)
        );

        Assertions.assertDoesNotThrow(
                () -> builder.zKlasa(klasa2)
                        .wSaliLekcyjnej(salaLekcyjna2)
                        .zZajeciem(11, 30)
        );

        var plan = builder.buduj();
        var planTestowyMapa = Map.of(
                "11a", Map.of(
                        DayOfWeek.MONDAY, List.of(new Zajecie(
                                new TerminZajec(DayOfWeek.MONDAY, 10, 45), 45, salaLekcyjna1, klasa1, przedmiot)),
                        DayOfWeek.TUESDAY, List.of(new Zajecie(
                                new TerminZajec(DayOfWeek.TUESDAY, 11, 30), 45, salaLekcyjna1, klasa1, przedmiot))
                ),
                "11b", Map.of(
                        DayOfWeek.TUESDAY, List.of(new Zajecie(
                                new TerminZajec(DayOfWeek.TUESDAY, 11, 30), 45, salaLekcyjna2, klasa2, przedmiot))
                ));
        var planTestowy = new PlanZajec();
        planTestowy.ustawTerminy(planTestowyMapa);

        Assertions.assertEquals(planTestowy, plan);
    }

    @Test
    void niepoprawnyStanTest() {
        // Nie ustawiono nazwy klasy i dnia tygodnia
        Assertions.assertThrows(
                IllegalStateException.class,
                () -> new PlanZajecBuilder().zZajeciem(0, 0)
        );

        // Nie ustawiono nazwy klasy
        Assertions.assertThrows(
                IllegalStateException.class,
                () -> new PlanZajecBuilder().zDniemTygodnia(DayOfWeek.MONDAY).zZajeciem(0, 0)
        );

        // Nie ustawiono dnia tygodnia
        Assertions.assertThrows(
                IllegalStateException.class,
                () -> new PlanZajecBuilder().zKlasa(klasa1).zZajeciem(0, 0)
        );
    }
}
