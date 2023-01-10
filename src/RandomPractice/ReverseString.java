package RandomPractice;

public class ReverseString {

    public static void main(String[] args) {
//        String word = "olalekan";
//        System.out.println(reverseString(word));

        String str = "Great Power";
        System.out.println(reverseCapital(str));
    }
    public static String reverseString(String letter){
        int CharacterLength = letter.length();
        String reversedLetter = "";
        int index = 1;
        while(index <= CharacterLength){
            reversedLetter += letter.charAt(CharacterLength-index);
            index++;
        }
        return reversedLetter;
    }
    public static String oneLineReverse(String userString){
        return new StringBuilder(userString).reverse().toString();
    }
    public static String reverseCapital(String letter){
        String result = (letter.charAt(0) + "").toUpperCase();
       for(int counter = 1; counter < letter.length(); counter++){
           result += letter.charAt(counter);
       }
       return result;
    }
    public static String FirstUppercase(String input){
        String firstLetter = ("" + input.charAt(0)).toUpperCase();
        String otherLetters = "";
        for(int counter = 1; counter < input.length(); counter++){
            otherLetters += input.charAt(counter);
            }
        System.out.println(otherLetters);
        //String otherLetters = input.substring(1).toLowerCase();
return firstLetter+otherLetters.toLowerCase();
    }
    public static String AllUpperCase(String input){
//        String firstLetter = ("" + input.charAt(0)).toUpperCase();
////String otherLetters = "";
//        String letters = ""+ input.charAt().toUpperCase();
//for(int counter = 1; counter < input.length(); counter++){
//    //otherLetters += input.charAt(counter);
//    letters += input.charAt(counter);
//}
//        System.out.println(letters);
        //System.out.println(otherLetters);
//return firstLetter+otherLetters.toUpperCase();
        return input.toUpperCase();
    }
}
