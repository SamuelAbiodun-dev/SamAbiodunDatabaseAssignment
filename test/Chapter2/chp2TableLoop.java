package Chapter2;

public class chp2TableLoop {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%s%n","Number", "Square", "Cube");
        for(int number = 0; number <= 10; number++){
            System.out.printf("%-10d%-10.1f%.1f%n",number,
                    Math.pow(number, 2), Math.pow(number, 3));
        }
    }
}
