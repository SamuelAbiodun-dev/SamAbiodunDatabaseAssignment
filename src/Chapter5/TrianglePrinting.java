package Chapter5;

public class TrianglePrinting {
    public static void main(String[] args){
        for(int counter1 = 1; counter1 <= 10; counter1++){
            for(int counter2 = 1; counter2 <= counter1; counter2++){
                System.out.printf("%s ", "*");
            }
            System.out.println();
        }
        System.out.println();
        for(int counter1 = 10; counter1 >= 1; counter1--){
            for(int counter2 = counter1; counter2  > 1; counter2--){
                System.out.printf("%s ", "*");
            }
            System.out.println();
        }
        System.out.println();
        for(int counter = 10; counter > 0; counter--){
            for(int counter2 = 0; counter2 < 10 + counter; counter2++){
                System.out.printf("%s ", " ");
            }
            for(int counter3 = counter; counter3 > 1; counter3--){
                System.out.printf("%s ", "*");
            }
            System.out.println();
        }
        System.out.println();
        for(int counter = 10; counter > 0; counter--){
            for(int counter2 = 0; counter2 < 10 - counter; counter2++){
                System.out.printf("%s ", " ");
            }
            for(int counter3 = counter; counter3 > 1; counter3--){
                System.out.printf("%s ", "*");
            }
            System.out.println();
        }
        for(int counter = 0; counter <= 10; counter++){
            for(int counter2 = 10 - counter; counter2 > 0; counter2--){
                System.out.printf("%s ", " ");
            }
            for(int counter3 = counter; counter3 > 1; counter3--){
                System.out.printf("%s ", "*");
            }
            System.out.println();
        }
    }
}