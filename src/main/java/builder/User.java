package builder;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder @Getter @Setter
public class User extends PersonData {
    private String email;
    private String data;
}