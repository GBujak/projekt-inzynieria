package pl.kielce.tu.projektszkola.dydaktyka;
// Grzegorz Bujak

import java.util.List;

public interface IPrzedmiot {
    String getNazwa();
    List<IMaterialDydaktyczny> getMaterialy();
    List<Nauczyciel> getNauczyciele();
}
