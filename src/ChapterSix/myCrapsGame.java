package ChapterSix;


import java.util.Scanner;
import java.util.Random;

    public class myCrapsGame {
        public static void main(String [] args)    {
            int point, sum;

            // Create a Random class object.
            Random randomNumbers = new Random();

            // Create a Scanner object to read input.
            Scanner input = new Scanner(System.in);

            System.out.println("First roll.\n");
            sum = playDice(randomNumbers);
            System.out.println("Sum:\t" + sum + "\n");

            switch (sum) {

                case 7: case 11:
                    System.out.println("Player wins.");
                    break;

                case 2: case 3: case 12:
                    System.out.println("Player loses.");
                    break;

                default:
                    point = sum;
                    do {
                        sum = playDice(randomNumbers);
                        System.out.println("Sum:\t" + sum + "\n");

                    } while (sum != 7 && sum != point);

                    if (sum == point)
                        System.out.println("Player wins.");
                    else
                        System.out.println("Player loses.");

            }
        }

        public static int playDice(Random randomNumbers) {
            int dice1, dice2;

            dice1 = randomNumbers.nextInt(7);
            dice2 = randomNumbers.nextInt(7);

            System.out.println("Dice 1:\t" + ++dice1);
            System.out.println("Dice 2:\t" + ++dice2);

            return dice1 + dice2;
        }


        // create role method
    }

