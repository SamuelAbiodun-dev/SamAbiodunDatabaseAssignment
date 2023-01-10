package Chapter5;
import java.util.Arrays;
public class Array_Swap {
    public static void main(String[] args) {

int sam = 0;
        int[] array = {5, 3, 9, 0, 1};

        for (int i = 0; i < array.length; i++) {
            for(int j = i+1; j < array.length; j++){
                if(array[j] < array[i]){
                    sam = array[j];
                    array[j] = array[i];
                    array[i] = sam;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
