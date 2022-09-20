package Chapter5;

public class Loops {
    public static void main(String[] args) {

        //Control variable initialization
        //loop ContinuationCondition
        //incrementing of control variable

        //initialization;
        //while (loop ContinuationCondition) {
        //statements
        // increment;
        // }
        int i = 0;
        while (i <= 5 ) {
            System.out.printf("%s%d%n" ," Hello, Cohort ",13);
            i++;
        }
        System.out.println();
        System.out.println("for loop");
        for(int counter = 5; counter >= 1; counter--) {
            System.out.println(counter + " Hello, Sam");
        }
        System.out.println();
        System.out.println("Do-while loop");
        int count = 1;
        do{
            System.out.println("Welcome, Cohort 14");
            count++;
        }
        while(count < 5);
    }
}
