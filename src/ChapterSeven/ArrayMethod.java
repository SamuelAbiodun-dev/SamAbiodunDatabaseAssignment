package ChapterSeven;

public class ArrayMethod {

    //public int addNumbers(int[] numbers) {
       // int total = 0;
        // for (int i = 0; i < numbers.length; i++) {
        // total = total + numbers[i];

        //OR
        //Using enhanced "for" loop
        // int total = 0;
        //for (int number : numbers) {
           // total = total + number;
      //  }

        //return total;
   // }


    public static void main(String... args) {
        ArrayMethod method = new ArrayMethod();
        //int [] numbers = {1,2,3,4,5};
       // System.out.println(method.addNumbers(numbers));
        System.out.println("The sum of the array is: " + method.addNumbers(1,2,3,4,5,6));
    }

    //public int addNumbers(int[] numbers) {
        public int addNumbers(int... numbers){
        // }
        //the compiler determines the datatype to be used of a variable based on the surrounding context; implicitly
        var total = 0;
        for (var number : numbers) {
            total += number;
        }
        return total;
    }
}

