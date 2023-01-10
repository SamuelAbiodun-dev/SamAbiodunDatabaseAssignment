package Chapter6;

import java.security.SecureRandom;

public class TossCoin {
    private static final SecureRandom randomNumbers = new SecureRandom();

    enum Face {HEAD, TAIL}
    public void displayFlip(){
        flip();
    }


//    public void displayMethod(){
//        switch(flipCoin()){
//            case 0: Face.TAIL = 0;
//            case 1: Face.HEAD = 1;
//        }
//    }
    public Face flip() {
        int random = randomNumbers.nextInt(2);
        Face status = Face.HEAD;
        if (random == 0) {
            status = Face.TAIL;
        }
//        System.out.printf("The status is: %s%n", status);;
       return status;
    }
}
