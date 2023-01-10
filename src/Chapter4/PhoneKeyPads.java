package Chapter4;

import java.util.Scanner;

public class PhoneKeyPads {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letter = input.nextLine();
        char character = letter.charAt(0);
        character = Character.toUpperCase(character);

        int number = 0;
        if(Character.isLetter(character)){
            if(character >= 'W'){
                number = 9;
            }
            else if(character >= 'T'){
                number = 8;
            }
            else if(character >= 'P'){
                number = 7;
            }
            else if(character >= 'M'){
                number = 6;
            }
            else if(character >= 'j'){
                number = 5;
            }
            else if(character >= 'G'){
                number = 4;
            }
            else if(character >= 'D'){
                number = 3;
            }
            else if(character >= 'A'){
                number = 2;
            }
            System.out.println("The corresponding number is " + number);
        }
        else {
            System.out.println(character + " is an invalid input");
        }
    }
}
