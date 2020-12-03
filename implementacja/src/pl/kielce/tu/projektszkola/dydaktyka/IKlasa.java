package pl.kielce.tu.projektszkola.dydaktyka;
// Grzegorz Bujak

import java.util.List;

public interface IKlasa {
    String getNazwa();
    int getRozmiarGrupy();
    List<Uczen> getUczniowie();
    Nauczyciel getNauczyciel();
    List<IPrzedmiot> getPrzedmioty();
}
