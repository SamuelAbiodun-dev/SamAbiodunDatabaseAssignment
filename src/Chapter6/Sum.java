package Chapter6;

public class Sum {

        public Sum() {
        }

        public static void main(String[] args) {
            int total = 0;
            boolean sum = false;

            for(int number = 0; number <= 10; ++number) {
                total += number;
            }

            System.out.printf("Sum is %d%n", total);
        }
    }



