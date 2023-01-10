package Chapter4;

public class TabularOutput {
    public static void main(String[] args) {
        System.out.printf("%s%8s%7s%7s%n", "N", "N^2", "N^3", "N^4");

        for(int count1 = 1; count1 <= 5; count1++){
            for(int count2 = 1; count2 <= 4; count2++){
                System.out.printf("%-7d", (int)Math.pow(count1, count2));
            }
            System.out.println();
        }
    }
}
