package pl.kielce.tu.projektszkola;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.kielce.tu.projektszkola.util.TerminZajec;

import java.time.DayOfWeek;
import java.util.List;
import java.util.stream.Collectors;

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

    @Test
    void compareToTest() {
        var termin1 = new TerminZajec(DayOfWeek.MONDAY, 10, 0);
        var termin2 = new TerminZajec(DayOfWeek.TUESDAY, 8, 50);
        var termin3 = new TerminZajec(DayOfWeek.TUESDAY, 9, 10);
        var termin4 = new TerminZajec(DayOfWeek.TUESDAY, 9, 30);
        var termin5 = new TerminZajec(DayOfWeek.FRIDAY, 0, 0);

        var lista = List.of(termin5, termin4, termin3, termin2, termin1);
        var posortowana = lista.stream().sorted().collect(Collectors.toList());

        Assertions.assertEquals(posortowana, List.of(termin1, termin2, termin3, termin4, termin5));

        for (var i : List.of(termin2, termin3, termin4, termin5))
            Assertions.assertTrue(termin1.jestPrzed(i));

        for (var i : List.of(termin1, termin2, termin3, termin4))
            Assertions.assertTrue(termin5.jestPo(i));
    }
}
