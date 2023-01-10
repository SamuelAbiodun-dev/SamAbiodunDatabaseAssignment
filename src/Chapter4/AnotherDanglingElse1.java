package Chapter4;

public class AnotherDanglingElse1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 11;
        if(x < 10) {
            if (y > 10)
                System.out.println("*****");
        }
        else {
            System.out.println("#####");
            System.out.println("$$$$$");
        }
    }
}
