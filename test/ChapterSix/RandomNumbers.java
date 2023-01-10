package ChapterSix;

import java.security.SecureRandom;

public class RandomNumbers {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        for(int counter = 1; counter <= 20; counter++){
            int dieFace = randomNumbers.nextInt(6) + 1;

            System.out.printf("%d ", dieFace);

            if(counter % 5 == 0){
                System.out.println();
            }
        }
    }
    }
