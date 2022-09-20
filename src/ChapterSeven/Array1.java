package ChapterSeven;

public class Array1 {
    public static void main(String[] args) {
        //creation of array
        //int[] numbers = new int[5]
       // data type array(object)
       // int[] numbers;
        //initialization
        //variable = new object (array) of datatype int to have a length of five
        //Indices: 0-4
        //numbers = new int [5];
        // numbers [0] = 2;
        //numbers [3] = 4;
        //numbers [2] = 8;
        //numbers [1] = 10;
        //numbers [4] = 7;

        //OR
        int [] values = {2,4,8,10,7};
        //String [] names = {"Kate", "Hadassah", "Tade", "Ore",}
//out-coding code is not good in practice
        //reversed lop
       //for (int index = numbers.length - 1; index >= 0; index--)
       //normal for loop
        for (int index = 0; index < values.length; index++)
       {
           System.out.println(values[index]);
       }
    }
}
