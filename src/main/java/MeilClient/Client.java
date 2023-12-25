package MeilClient;
import MeilClient.Gender;
import lombok.Getter;
import lombok.Setter;



public class Client {
    private static int count = 0;
    @Getter
    private final int id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private int age;
    @Getter @Setter
    private Gender gender;
    @Getter @Setter
    private String email;

    public Client(String name, int age, Gender gender, String email) {
        this.id = count++;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }
}
