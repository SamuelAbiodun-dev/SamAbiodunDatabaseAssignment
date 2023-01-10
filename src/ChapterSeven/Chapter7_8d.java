package ChapterSeven;

public class Chapter7_8d {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        System.out.println("The first array:");
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

        System.out.println();

        System.out.println("The first array displayed in reverse order:");
        for(int i = array.length -1; i > 0; i--)
            System.out.print(array[i] + " ");

    }
}
