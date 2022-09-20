package PhoneBookEntry;

public class PhoneBookEntry {

    private String newLastName;
    private int newNum;

    public static PhoneBookEntry getEntry() {
        return null;
    }

    public boolean sameLastName(String lastName) {
        return false;
    }

    public void changeLastName(String newLastName) {
        this.newLastName = newLastName;
    }

    public void changeNumber(int newNum) {
        this.newNum = newNum;
    }
}
