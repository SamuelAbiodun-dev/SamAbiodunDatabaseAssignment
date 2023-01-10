package RandomPractice;

public class SortArray {
        public static void main(String[] args) {

            //Initialize array
            int [] array = new int [] {3, 4, 1, 6, 3, 8, 9, 4};
            int temp = 0;
            //Displaying elements of original array
            System.out.println("Elements of original array: ");
            for (int index = 0; index < array.length; index++) {
                System.out.print(array[index] + " ");
            }
            //Sort the array in ascending order
            for (int index = 0; index < array.length; index++) {
                for (int ascendIndex = index+1; ascendIndex < array.length; ascendIndex++) {
                    if(array[index] > array[ascendIndex]) {
                        temp = array[index];
                        array[index] = array[ascendIndex];
                        array[ascendIndex] = temp;
                    }
                }
            }
            System.out.println();
            //Displaying elements of array after sorting
            System.out.println("Elements of array sorted in ascending order: ");
            for (int index = 0; index < array.length; index++) {
                System.out.print(array[index] + " ");
            }
            for (int index = 0; index < array.length; index++) {
                for (int ascendIndex = index+1; ascendIndex < array.length; ascendIndex++) {
                    if(array[index] < array[ascendIndex]) {
                        temp = array[index];
                        array[index] = array[ascendIndex];
                        array[ascendIndex] = temp;
                    }
                }
            }

            System.out.printf("%nElements of array sorted in descending order: %n");
            for (int index = 0; index < array.length; index++) {
                System.out.print(array[index] + " ");
            }
        }

    }
