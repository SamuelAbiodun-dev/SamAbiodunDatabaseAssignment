package Chapter5;

public class Counting {
    public static void main(String[] args) {
        for(int counter = 1; counter < 3; counter++){
            for(int counter2 = 1; counter2 < 5; counter2++)
                System.out.print('*');
            System.out.println("\n#####");
        }
    }
}
