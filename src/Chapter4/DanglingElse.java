package Chapter4;

public class DanglingElse {
    public static void main(String[] args) {
int x = 6;
int y = 4;
        if (x > 5) {
            if (y > 5) {
                System.out.println("Both x and y are > 5");
            }
        }
        else {
            System.out.println("x is < 5");
        }
    }
}
