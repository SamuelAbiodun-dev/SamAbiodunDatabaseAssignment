package tdd;

public class MyAccount {
    private int balance;

    public void deposit(int amount) {
    if(amount > 0) {
        balance = balance + amount;
    }
    }
    public int getBalance() {
        return balance;
        }

}
