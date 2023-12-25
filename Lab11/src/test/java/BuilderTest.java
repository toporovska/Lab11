import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import builder.Gender;
import builder.User;

public class BuilderTest {
    @Test
    public void testIvan() {
        User ivan = User.builder().name("Ema").age(12).age(15).gender(Gender.FEMALE).weight(40).height(150).build();
        Assertions.assertEquals(ivan.getName(), "Ema");
        Assertions.assertEquals(ivan.getAge(), 15);
        Assertions.assertEquals(ivan.getGender(), Gender.FEMALE);
        Assertions.assertEquals(ivan.getWeight(), 40);
        Assertions.assertEquals(ivan.getHeight(), 150);
    }

    @Test
    public void testPetro() {
        User petro = User.builder().name("Petro").gender(Gender.MALE).age(26).build();
        Assertions.assertEquals(petro.getName(), "Petro");
        Assertions.assertEquals(petro.getAge(), 26);
        Assertions.assertEquals(petro.getGender(), Gender.MALE);
        Assertions.assertEquals(petro.getWeight(), 0);
        Assertions.assertEquals(petro.getHeight(), 0);
        Assertions.assertEquals(petro.getOccupations().size(), 0);
    }

    @Test
    public void testAlice() {
        User alice = User.builder().name("Alex").gender(Gender.FEMALE).age(21).occupation("Student").build();
        Assertions.assertEquals(alice.getName(), "Alex");
        Assertions.assertEquals(alice.getAge(), 21);
        Assertions.assertEquals(alice.getGender(), Gender.FEMALE);
        Assertions.assertEquals(alice.getWeight(), 0);
        Assertions.assertEquals(alice.getHeight(), 0);
        Assertions.assertEquals(alice.getOccupations().size(), 1);
        Assertions.assertEquals(alice.getOccupations().get(0), "Student");
    }

    @Test
    public void testDefault() {
        User defaultUser = User.builder().build();
        Assertions.assertNull(defaultUser.getName());
        Assertions.assertEquals(defaultUser.getAge(), 0);
        Assertions.assertNull(defaultUser.getGender());
        Assertions.assertEquals(defaultUser.getWeight(), 0);
        Assertions.assertEquals(defaultUser.getHeight(), 0);
        Assertions.assertEquals(defaultUser.getOccupations().size(), 0);
    }
}