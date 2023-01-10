package ChapterSeven;

public class ExecutionTime {
    public static void main(String[] args) {
        int num;
        int[] numbers = new int[10000];
        for(int index = 0; index < numbers.length; index++){
            numbers[index] = getRandomInt();
        }
        int key = getRandomInt();
        int searchResult;
        long startTime = System.currentTimeMillis();
        searchResult = linearSearch(numbers, key);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Execution time of invoking the linearSearch in " +
                "milliseconds:" + executionTime + " ");

        selectionSort(numbers);
        startTime = System.currentTimeMillis();
        searchResult = binarySearch(numbers, key);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Execution time of invoking the binarySearch in " +
                "milliseconds: " + executionTime + " ");

    }

    public static int getRandomInt() {
        return 1 + (int)(Math.random() * 100000);
    }
    public static int linearSearch(int[] array, int key){
        for(int index = 0; index < array.length; index++){
            if(key == array[index]){
                return index;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int key){
        int low = 0;
        int high = array.length - 1;

        while(high >= low){
            int mid = (low + high) / 2;
            if(key < mid){
                high = mid - 1;
            }
            else if(key == mid){
                return mid;
            }
            else{
                low = mid + 1;
            }
        }
        return -low -1;
    }

    public static void selectionSort(int[] array){
        for(int index = 0; index < array.length; index++){
            int minimum = array[index];
            int minimumIndex = index;

            for(int index2 = index + 1; index2 < array.length; index2++){
                if(minimum > array[index2]){
                    minimum = array[index2];
                    minimumIndex = index2;
                }
            }
            if(minimumIndex != index){
                array[minimumIndex] = array[index];
                array[index] = minimum;
            }
        }

    }

}
