package pl.kielce.tu.projektszkola.zajecia;
// Grzegorz Bujak

import pl.kielce.tu.projektszkola.dydaktyka.Klasa;
import pl.kielce.tu.projektszkola.dydaktyka.Przedmiot;
import pl.kielce.tu.projektszkola.util.TerminZajec;
import pl.kielce.tu.projektszkola.zajecia.planzajec.PlanZajecImpl;

import java.time.DayOfWeek;
import java.util.*;

public class PlanZajecBuilder {
    private Klasa ustawionaKlasa;
    private DayOfWeek ustawionyDzienTygodnia;
    private int ustawionyCzasTrwania = -1;
    private SalaLekcyjna ustawionaSala;
    private Przedmiot ustawionyPrzedmiot;

    private Map<String, Map<DayOfWeek, List<Zajecie>>> planZajec;

    public PlanZajecBuilder zCzasemTrwania(int czas) {
        if (czas < 1) throw new IllegalArgumentException("Builder: błędny czas trwania");
        this.ustawionyCzasTrwania = czas;
        return this;
    }

    public PlanZajecBuilder wSaliLekcyjnej(SalaLekcyjna sala) {
        this.ustawionaSala = sala;
        return this;
    }

    public PlanZajecBuilder zPrzedmiotu(Przedmiot przedmiot) {
        this.ustawionyPrzedmiot = przedmiot;
        return this;
    }

    public PlanZajecBuilder zKlasa(Klasa klasa) {
        this.ustawionaKlasa = klasa;
        return this;
    }

    public PlanZajecBuilder zDniemTygodnia(DayOfWeek dzien) {
        this.ustawionyDzienTygodnia = dzien;
        return this;
    }

    public PlanZajecBuilder zZajeciem(int godzina, int minuta) {
        if (ustawionaKlasa == null)
            throw new IllegalStateException("Builder: nieustawiona klasa");
        if (ustawionyDzienTygodnia == null)
            throw new IllegalStateException("Builder: nieustawiony dzien tygodnia");
        if (ustawionyPrzedmiot == null)
            throw new IllegalStateException("Builder: nieustawiony przedmiot");
        if (ustawionaSala == null)
            throw new IllegalStateException("Builder: nieustawiona sala");
        if (ustawionyCzasTrwania < 1)
            throw new IllegalStateException("Builder: nieustawiony czas trwania");

        var nowyTermin = new TerminZajec(this.ustawionyDzienTygodnia, godzina, minuta);
        var nazwaKlasy = this.ustawionaKlasa.getNazwa();

        if (planZajec == null)
            planZajec = new HashMap<>();
        if (!planZajec.containsKey(nazwaKlasy))
            planZajec.put(nazwaKlasy, new HashMap<>());
        if (!planZajec.get(nazwaKlasy).containsKey(ustawionyDzienTygodnia))
            planZajec.get(nazwaKlasy).put(ustawionyDzienTygodnia, new ArrayList<>());

        var lista = planZajec.get(nazwaKlasy).get(ustawionyDzienTygodnia);

        // Sprawdzenie czy zajęcia się nie pokrywają
        for (var zajecie : lista)
            if (zajecie.getData().pokrywaSie(nowyTermin))
                throw new IllegalStateException("Builder: pokrywanie się zajęć");

        // Sprawdzenie czy wystarczy miejsca w sali
        if (ustawionaKlasa.getRozmiarGrupy() > ustawionaSala.getIloscMiejsc())
            throw new IllegalStateException("Builder: za mało miejsc w sali");

        // Sprawdzenie czy sala nie jest zajęta
        for (var mapaDni : planZajec.values())
            for (var listaZajec : mapaDni.values())
                for (var zajecia : listaZajec)
                    if (zajecia.getSalaLekcyjna().equals(ustawionaSala)
                     && zajecia.getData().pokrywaSie(nowyTermin))
                        throw new IllegalStateException("Builder: sala zajęta");

        var noweZajecia = new Zajecie(
                nowyTermin, ustawionyCzasTrwania, ustawionaSala,
                ustawionaKlasa, ustawionyPrzedmiot);

        lista.add(noweZajecia);
        lista.sort(Comparator.comparing(Zajecie::getData));

        return this;
    }

    public PlanZajecImpl buduj() {
        var nowyPlan = new PlanZajecImpl();
        nowyPlan.ustawTerminy(this.planZajec);
        this.planZajec = null;
        return nowyPlan;
    }
}
