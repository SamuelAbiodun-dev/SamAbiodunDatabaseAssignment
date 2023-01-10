package RandomPractice;

import java.util.Scanner;

public class TicTacToe2 {
    private final Scanner input = new Scanner(System.in);

    private final String[] moves = {"", "", "", "", "", "", "", "", "", ""};
    public int userPosition;
    public int[] movesArray = new int[10];

    public void displayBoard(){
        System.out.printf("""
                %3s  | %2s   | %2s
                -----+------+-----
                %3s  | %2s   | %2s
                -----+------+-----
                %3s  | %2s   | %2s%n%n""", moves[1], moves[2], moves[3], moves[4],
        moves[5], moves[6], moves[7], moves[8], moves[9]);
    }

    public void move(String mark, int position){
        moves[position] = mark;
    }

    public boolean movement(int position1, int position2, int position3){
            boolean check = false;
            if(!moves[position1].equals("")){
                if(moves[position1].equals(moves[position2]) && moves[position2].equals(moves[position3])){
                    check = true;
            }
    }
            return check;
}

public boolean playerWins(){
        boolean won = false;
        if(movement(1, 2, 3)){
            won = true;
        }
        if(movement(4, 5, 6)){
            won = true;
        }
        if(movement(7, 8, 9)){
            won = true;
        }
        if(movement(1, 4, 7)){
            won = true;
        }
        if(movement(2, 5, 8)){
            won = true;
        }
        if(movement(3, 6, 9)){
            won = true;
        }
        if(movement(1, 5, 9)){
            won = true;
        }
        if(movement(3, 5, 7)){
            won = true;
        }
        return won;
}
public void player1(){
    System.out.println("Player 1 play");
    userPosition = input.nextInt();
    if(isValid(userPosition)){
        move("X",userPosition);
        System.out.println();
        displayBoard();
        if(playerWins()){
            System.out.println("Player Wins!");
        }
        else{
            System.out.println("Make new move");
            player1();
        }
    }
}

    public void player2(){
        System.out.println("Player 2 play");
        userPosition = input.nextInt();
        if(isValid(userPosition)){
            move("X",userPosition);
            System.out.println();
            displayBoard();
            if(playerWins()){
                System.out.println("Player Wins!");
            }
            else{
                System.out.println("Make new move");
                player2();
            }
        }
    }
    public boolean isValid(int userPosition){
        boolean validation = true;
        for(int i = 0; i < 9; i++){
            if(movesArray[i] == userPosition){
                validation = false;
                break;
            }
        }
        if(userPosition < 1 || userPosition > 9){
            validation = false;
        }
        return validation;
    }
}
