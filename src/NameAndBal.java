public class NameAndBal {
    String name;
    double balance;
    public NameAndBal(String name, double balance) {
        this.name = name;

        if (balance > 0) {
            this.balance = balance;
        }
    }
}
