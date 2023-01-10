package ChapterSeven;

public class PassByValue {

    public static void main(String[] args) {
        int x = 33;
        System.out.println("Before: " + x);
        increment(x);
        System.out.println("After: " + x);
    }

    static void increment(int x) {
        x++;
        System.out.println("Function: " + x);
    }

}


