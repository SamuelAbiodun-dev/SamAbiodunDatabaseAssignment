package ChapterSeven;

public class Array2 {
    public static void main(String[] args) {
        String [] colours = new String[7];
        colours [0] = "Blue";
        colours [1] = "indigo";
        colours [2] = "violet";
        colours [3] = "Red";
        colours [4] = "White";
        colours [5] = "Black";
        colours [6] = "Orange";

        System.out.println("My colours:");


//i = index
        for (int index = 0; index < colours.length; index++) {

            if (index == 6) {
                System.out.printf("%s: ", "My favourite colour");
            }
            System.out.println(colours[index]);


        }
}
    }

