package strategy;

import MeilClient.Client;
import MeilClient.MailCode;

public class GiftMail implements MailCode {
    private static final String TEMPLATE = "%NAME, you won the lottery! "
            + "Send us your card number and code so we can transfer you 1 million!";

    @Override
    public String generate(Client client) {
        return TEMPLATE.replaceAll("%NAME", client.getName());
    }
}
