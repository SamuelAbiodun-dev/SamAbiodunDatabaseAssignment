package ChapterSeven;

import java.util.Arrays;

public class SudokuArray {
    public static void main(String[] args) {
sudokuGame();
    }
    static void sudokuGame() {
        int[][] array = new int[9][9];
        for (int column = 0; column < array.length; column++) {
            for (int row = 0; row < array.length; row++) {
                int value = column + row + 1;
                    array[column][row] = value > 9 ? value % 10 + 1 : value;
            }
        }
        output(array);
    }
    static int[][] output(int[][] array){
        for (int[] sudoku : array) {
            System.out.println(Arrays.toString(sudoku));
        }
        return array;
    }
}
