package pl.kielce.tu.projektszkola.zajecia;

public class ZaproszenieAppDec extends Zaproszenie{

    private Notifier notifier;

    @Override
    public void send() {

        notifier.stworzPowiadomienie();
        notifier.send(adresyEmail);
    }
}
