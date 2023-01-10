package ChapterSeven;

public class DigitCounter {
    public static int count(String text){
        int numberOfDigits = 0;
        for(int  counter = 0; counter < text.length(); counter++){
            if(Character.isDigit(text.charAt(counter))){
                numberOfDigits++;
            }
        }
        return numberOfDigits;
    }


        public static int counter(String text){
        String numbers = "0123456789";
            int numberOfDigits = 0;
            for(int  counter = 0; counter < text.length(); counter++){
                if(numbers.contains(String.valueOf(text.charAt(counter)))){
                    numberOfDigits++;
                }
            }
            return numberOfDigits;
        }

}
