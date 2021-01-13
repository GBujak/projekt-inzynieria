package pl.kielce.tu.projektszkola.zajecia;

import pl.kielce.tu.projektszkola.dydaktyka.Uczen;

public class ZaproszenieEmailDec extends Zaproszenie {

    @Override
    public void send() {

            IEmailSender emailSender = new EmailSender();
            emailSender.send(adresyEmail);
    }
}
