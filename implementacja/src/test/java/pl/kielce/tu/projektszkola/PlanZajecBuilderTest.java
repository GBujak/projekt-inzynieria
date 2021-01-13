package pl.kielce.tu.projektszkola;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.kielce.tu.projektszkola.zajecia.PlanZajecBuilder;

import java.time.DayOfWeek;

public class PlanZajecBuilderTest {
    @Test
    void pokrywaSieTest() {
        var builder = new PlanZajecBuilder();
        builder.zNazwaKlasy("11a")
                .zDniemTygodnia(DayOfWeek.MONDAY)
                .zZajeciem(11, 20, "Matematyka");

        Assertions.assertThrows(
                IllegalStateException.class,
                () -> builder.zZajeciem(11, 30, "Polski")
        );

        Assertions.assertDoesNotThrow(
                () -> builder.zDniemTygodnia(DayOfWeek.TUESDAY)
                    .zZajeciem(11, 30, "Polski")
        );

        Assertions.assertDoesNotThrow(
                () -> builder.zNazwaKlasy("11b")
                        .zZajeciem(11, 30, "Polski")
        );
    }

    @Test
    void niepoprawnyStanTest() {
        // Nie ustawiono nazwy klasy i dnia tygodnia
        Assertions.assertThrows(
                IllegalStateException.class,
                () -> new PlanZajecBuilder().zZajeciem(0, 0, "")
        );

        // Nie ustawiono nazwy klasy
        Assertions.assertThrows(
                IllegalStateException.class,
                () -> new PlanZajecBuilder().zDniemTygodnia(DayOfWeek.MONDAY).zZajeciem(0, 0, "")
        );

        // Nie ustawiono dnia tygodnia
        Assertions.assertThrows(
                IllegalStateException.class,
                () -> new PlanZajecBuilder().zNazwaKlasy("11a").zZajeciem(0, 0, "")
        );
    }
}
