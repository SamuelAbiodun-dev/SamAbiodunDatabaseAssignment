package ChapterSeven;

import java.util.Arrays;

public class ArrayFilled {

    public static void main(String[] args) {
        fillArray();
        charArray();
        multiDimensional();
    }
    public static int fillArray() {
        int[] elements = new int[10];
        int index;
        for (index = 1; index < elements.length; index++) {
            elements[index - 1] = index;
            //elements[index] = index + 1;
        }
        //for(index = 1; index < elements.length; index++){
            System.out.printf(index + ", ");
        //Arrays.stream(elements).parallel().forEach(elements--> );
        return index;
        //System.out.println(Arrays.toString(elements));
    }
    public static void charArray(){
     char[] array = new char[3];
     array[0] = 'x';
     array[1] = 'o';
     array[2] = 'x';
        System.out.println(array);
    }
    public static void multiDimensional(){
        char[][] values = new char [2][7];
        values[0][0] = 's';
        values[0][1] = 'a';
        values[0][2] = 'm';
        values[0][3] = 'u';
        values[0][4] = 'e';
        values[0][5] = 'l';
        values[1][0] = 'a';
        values[1][1] = 'b';
        values[1][2] = 'i';
        values[1][3] = 'o';
        values[1][4] = 'd';
        values[1][5] = 'u';
        values[1][6] = 'n';
        System.out.println(Arrays.deepToString(values));



    }
}

