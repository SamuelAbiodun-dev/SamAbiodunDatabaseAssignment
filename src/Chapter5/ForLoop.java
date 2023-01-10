package Chapter5;

public class ForLoop {
    public static void main(String[] args) {
        int total = 0;
        for(int number = 1; number <= 10; number++){
            System.out.printf("%d ", number);
            total = total + number;

        }
        System.out.printf("%nThe sum of numbers is: %d", total);
        System.out.println();
    }
}
