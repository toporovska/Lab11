import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import MeilClient.Client;
import MeilClient.Gender;
import MeilClient.MailCode;
import MeilClient.MailInfo;
import strategy.*;

public class StrategyTests {

    private final Client client = new Client("FlowerStore", 56, Gender.MALE, "FlowerStor@gmail.com");;

    @Test
    public void clientTest() {
        Client second = new Client("Alex", 21, Gender.MALE, "mail");
        Assertions.assertEquals(client.getName(), "FlowerStore");
        Assertions.assertEquals(client.getGender(), Gender.MALE);
        Assertions.assertEquals(client.getEmail(), "FlowerStor@gmail.com");

        Assertions.assertEquals(second.getName(), "Alex");
        Assertions.assertEquals(second.getAge(), 21);
        Assertions.assertEquals(second.getGender(), Gender.MALE);
        Assertions.assertEquals(second.getEmail(), "mail");
    }

    @Test
    public void giftTest() {
        Client Alex = new Client("Alex", 21, Gender.MALE, "mail");
        GiftMail giftMail = new GiftMail();
        Assertions.assertInstanceOf(MailCode.class, giftMail);
        Assertions.assertEquals(giftMail.generate(Alex),
                "Alex, you won the lottery! "
                + "Send us your card number and code so we can transfer you 1 million!");
    }

}