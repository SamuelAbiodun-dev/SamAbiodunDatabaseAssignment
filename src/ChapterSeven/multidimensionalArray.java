package ChapterSeven;

import java.util.Arrays;

public class multidimensionalArray {
    public static void main(String[] args) {
        char[][] elements = {{'x', 'o', 'x'}, {'x', 'o', 'x'}, {'x', 'x', 'o'}};
        for (int row = 0; row < elements.length; row++) {
            for (int column = 0; column < elements[row].length; column++) {
                System.out.print(elements[row][column]+ " ");
//            System.out.println(Arrays.deepToString(elements));
            }
            System.out.println();
        }
    }
}
