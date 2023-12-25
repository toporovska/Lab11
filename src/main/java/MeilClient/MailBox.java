package MeilClient;

import lombok.SneakyThrows;
import strategy.MailSender;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private final List<MailInfo> infos;
    private final MailSender sender;

    MailBox(MailSender sender) {
        this.sender = sender;
        infos = new ArrayList<>();
    }

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    @SneakyThrows
    public void sendAll() {
        for (MailInfo mail : infos) {
            sender.sendMail(mail);
        }
        infos.clear();
    }
}
