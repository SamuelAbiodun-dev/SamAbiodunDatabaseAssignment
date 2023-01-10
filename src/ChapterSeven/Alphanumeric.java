package ChapterSeven;

public class Alphanumeric {
    public static int countVariable(String values){
        int count = 0;
        for(int counter = 0; counter < values.length(); counter++) {
            String letter = "" + values.charAt(counter);
            for (int counter2 = 0; counter2 < 10; counter2++) {
                if (letter.equals(Integer.toString(counter2))){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(Alphanumeric.countVariable("b1b2b3b4b5"));
    }
}
