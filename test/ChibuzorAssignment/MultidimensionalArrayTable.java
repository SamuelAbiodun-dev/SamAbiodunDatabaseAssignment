package ChibuzorAssignment;

public class MultidimensionalArrayTable {
    public static void main(String[] args) {
        int[][] tableOfValues = new int[20][20];


        for(int i = 0; i < tableOfValues.length; i++){
            for(int j = 0; j < tableOfValues[i].length; j++){
                System.out.printf("%2s", tableOfValues[i][j] == 0 ? "*" : " ");
            }
            System.out.println();
        }
    }
}
