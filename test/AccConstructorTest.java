import static org.junit.jupiter.api.Assertions.*;

class AccConstructorTest {
    public static void main(String[] args) {
        AccConstructor account = new AccConstructor("Ajibade Samuel");
        AccConstructor account2 = new AccConstructor("Abiodun Samuel");

        System.out.printf("Account1 name is: %s%n", account.getName());
        System.out.printf("Account2 name is: %s%n", account2.getName());

    }

}