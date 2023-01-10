package RandomPractice;

public class EggsBox {
    public static void main(String[] args) {

       int noOfCompleteEggs = 100;
       int eggsPerBox = 9;

        int noOfBoxes = (int) Math.ceil((double) noOfCompleteEggs / eggsPerBox);
        //int noOfBoxes = 1 + noOfCompleteEggs / eggPerBox;
        System.out.printf("The number of boxes that can occupy " + noOfCompleteEggs + " eggs is = " + noOfBoxes);

        int eggsInLastBox;
        if (noOfCompleteEggs % eggsPerBox == 0) {
           eggsInLastBox = eggsPerBox;
       }
        else {
            eggsInLastBox = noOfCompleteEggs % eggsPerBox;
        }

        System.out.printf("%nThe number of eggs in the last box is = " + eggsInLastBox);

        int eggsNeeded = eggsPerBox - eggsInLastBox;
        System.out.printf("%nThe number of eggs needed to fill up the last box is = " + eggsNeeded);

    }
}
