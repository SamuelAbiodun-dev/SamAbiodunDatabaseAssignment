package ChapterSeven;

public class countSingleNumbers {

    public static void main(String[] args) {
        int[] counts = new int[10];
        for(int index = 1; index <= 1000; index++){
            counts[(int)(Math.random() * 10)]++;
        }
        System.out.println("Count for each number between 0 and 9: ");
        for(int index = 0; index < counts.length; index++){
            System.out.println(index + "s:  " + counts[index]);
        }
    }
}
