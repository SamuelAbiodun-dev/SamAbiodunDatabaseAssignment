package ChapterSeven;

public class ArraySMM {
    public static int maxArray(){
        int[] array = {1,2,3,4};
        int max = array[0];
        for (int ma : array){
            if (array[1] > max ) {
                max = array[1];
            }
            if (array[2] > max){
                max = array[2];
            }
            if(array[3] > max){
                max = array[3];
            }
        }
        return max;
    }

    public int collectionOfArray(){
        int[] array = {1, 2, 3, 4};
        int sum = 0;
        for (int num : array) {
            sum = sum + num;
        }

        return sum;
    }
    public static int minArray(){
        int[] array = {1,2,3,4};
        int min = array[0];
        for (int num : array){
            if (array[1] < min ) {
                min = array[1];
            }
            if (array[2] < min){
                min = array[2];
            }
            if(array[3] < min){
                min = array[3];
            }
        }
        return min;
    }
    //int [] scores = new int[5];

   /* public static int[] sumArray(int[] scores) {
        int[] array = new int[5];
    int sum = 0;
    for(int counter = 0; counter < array.length; counter++){
        sum += array[counter];
    }
        System.out.println(sum);
    return new int[]{sum};
    }*/
}
