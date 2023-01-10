package ChibuzorAssignment;
class LargestArrayElementTest {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 5, 6};
        int[] secondArray = {44, 66, 99, 77, 88, 55, 22};
        System.out.printf("The largest element in the first array is: %d", LargestArrayElement.getLargestElement(firstArray, 5));
        System.out.printf("%nThe largest element in the second array is: %d", LargestArrayElement.getLargestElement(secondArray, 7));

    }

}