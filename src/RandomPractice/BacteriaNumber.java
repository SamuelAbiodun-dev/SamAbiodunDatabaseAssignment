package RandomPractice;

public class BacteriaNumber {
    public static void main(String[] args) {
        System.out.printf("%s%16s%n", "Hour", "BacteriaNumber");
//todo counting the number of bacteria
        for (int counter = 0; counter < 4; counter++ ) {
            System.out.printf("%4d%16d%n", 5 * counter, 200 * (int)Math.pow(2,5 * counter));
            }

        }
    }

