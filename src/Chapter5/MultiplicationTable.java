package Chapter5;

public class MultiplicationTable {
    public static void main(String[] args) {
        //multiply(1);
        //multiplyOneToTwelve();
        multiply1To12();
    }
    public static int multiply(int number){
        int product = 1;
        for(int counter = 1; counter <= number; counter++){
            for(int counter2 = counter; counter2 <= 12; counter2++){
                product = counter * counter2;
                System.out.printf("%d * %d = %d%n", counter, counter2, product);
            }
            System.out.println();
        }
        return product;
    }

//
    public static void multiply1To12(){
        int product;
        for(int counter = 1; counter <= 12; counter++){
            for(int counter2 = 1; counter2 <= 20; counter2++){
                product = counter * counter2;
                System.out.printf("%6d", product);
            }
            System.out.println();
        }
    }
}
