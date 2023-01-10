package ChapterEight;

public class HugeIntegerClass {

    private int[] digitArray = new int[40];
    private int digitLength;
    public void parse(String number){
        digitLength = number.length();
        for(int index = 0; index < number.length(); index++){
            String character = Character.toString(number.charAt(index));
            digitArray[index] = Integer.parseInt(character);
        }
    }
    public boolean isEqualTo(int number1, int number2){
        boolean check = false;
        if(number1 == number2){
            check = true;
        }
        return check;
    }

    public boolean isNotEqualTo(int number1, int number2){
        boolean check = false;
        if(number1 != number2){
            check = true;
        }
        return check;
    }

    public boolean isGreaterThan(int number1, int number2){
        boolean check = false;
        if(number1 > number2){
            check = true;
        }
        return check;
    }

    public boolean isLessThan(int number1, int number2){
        boolean check = false;
        if(number1 < number2){
            check = true;
        }
        return check;
    }

    public boolean isGreaterThanOrEqualTo(int number1, int number2){
        boolean check = false;
        if(number1 >= number2){
            check = true;
        }
        return check;
    }

    public boolean isLessThanOrEqualTo(int number1, int number2){
        boolean check = false;
        if(number1<= number2){
            check = true;
        }
        return check;
    }

    public boolean isZero(int number){
        boolean check = false;
        if(number == 0){
            check = true;
        }
        return check;
    }

    public int add(int number1, int number2){
        return number1 + number2;
    }


    public int subtract(int number1, int number2){
        return number1 - number2;
    }


    public String toString(int number){
        return Integer.toString(number);
    }

    public String toString(){
        String number = "";
        for(int index = 0; index < digitLength; index++){
            number += Integer.toString(digitArray[index]);
        }
        return number;
    }

    public int[] getDigitArray() {
        return digitArray;
    }

    public void setNumber(int intNumber){
        String number = Integer.toString(intNumber);
        digitLength = number.length();
        for(int index = 0; index < number.length(); index++){
            String character = Character.toString(number.charAt(index));
            digitArray[index] = Integer.parseInt(character);
        }
    }

    public int getNumber(){
        String number = "";
        for(int index = 0; index < digitLength; index++){
            number += Integer.toString(digitArray[index]);
        }
        return Integer.parseInt(number);
    }
}
