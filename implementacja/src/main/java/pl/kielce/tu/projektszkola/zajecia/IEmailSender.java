package pl.kielce.tu.projektszkola.zajecia;

import java.util.List;

public interface IEmailSender {

    public void connectToEmailSenderServer();
    public void send(List<String> email);
}
