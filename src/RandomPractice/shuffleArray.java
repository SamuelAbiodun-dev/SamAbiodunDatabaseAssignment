package RandomPractice;

public class shuffleArray {
    public static void main(String[] args) {
    shuffle();
    }
public static void shuffle(){
        int[] array = {1, 2, 3, 4, 5};
        int temp = 0;
        //Displaying elements of original array
        System.out.println("Elements of original array: ");
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
        //Sort the array in ascending order
        for (int index = 0; index < array.length; index++) {
            for (int ascendIndex = index + 4; ascendIndex < array.length; ascendIndex++) {
                if (array[index] < array[ascendIndex]) {
                    temp = array[index];
                    array[index] = array[ascendIndex];
                    array[ascendIndex] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("The shuffled elements of the original array:");
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
    }
}