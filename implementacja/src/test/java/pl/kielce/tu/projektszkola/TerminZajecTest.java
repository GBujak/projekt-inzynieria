package pl.kielce.tu.projektszkola;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.kielce.tu.projektszkola.util.TerminZajec;

import java.time.DayOfWeek;

public class TerminZajecTest {
    @Test
    void pokrywaSieTest() {
        var termin1 = new TerminZajec(DayOfWeek.MONDAY, 12, 30);
        var termin2 = new TerminZajec(DayOfWeek.TUESDAY, 12, 35);

        Assertions.assertFalse(termin1.pokrywaSie(termin2));

        var termin3 = new TerminZajec(DayOfWeek.MONDAY, 11, 30);
        var termin4 = new TerminZajec(DayOfWeek.MONDAY, 12, 0);

        Assertions.assertFalse(termin1.pokrywaSie(termin3));
        Assertions.assertTrue(termin1.pokrywaSie(termin4));

        var termin5 = new TerminZajec(DayOfWeek.MONDAY, 15, 0);
        var termin6 = new TerminZajec(DayOfWeek.MONDAY, 13, 0);

        Assertions.assertFalse(termin1.pokrywaSie(termin5));
        Assertions.assertTrue(termin1.pokrywaSie(termin6));
    }
}
