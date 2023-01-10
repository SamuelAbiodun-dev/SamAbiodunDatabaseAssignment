package Chapter4;

public class RandomUpperCaseLetter {
    public static void main(String[] args) {
        int number = 65 + (int)(Math.random() * (91 - 65));

        System.out.println((char) (number));
       }
}
