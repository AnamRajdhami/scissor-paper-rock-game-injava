import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        //take input from user: S,P,R

        Scanner inputObj = new Scanner(System.in);
        System.out.println("Please enter S, P, or R");
        char userMove = inputObj.next().charAt(0);
        System.out.println("user gave this input>>" + userMove);

        //Make computer to make their move
        char[] arr = {'S', 'P', 'R'};
        Random random = new Random();
        int guessNumber = random.nextInt(3);
        char computerMove = arr[guessNumber]; 
        System.out.println("Computer move >> "+ computerMove);

        //computer = user ->draw
        if(userMove == computerMove){
            System.out.println("draw");
           }  
        // user "S"
            // computer "R" -: computer wins!
            // user wins
        if(userMove == 'S' && computerMove == 'R'){
            System.out.println("Computer wins!!!");
        }else if(userMove == 'R' && computerMove == 'S'){
            System.out.println("You win!!!");
        }
        // user "P"
        // computer "R" -: user wins!
        // computer wins
        if(userMove == 'P' && computerMove == 'R'){
            System.out.println("User wins!!!");
        }else if(userMove == 'R' && computerMove == 'P'){
            System.out.println("Computer wins!!!");
        }
        // user "R"
        // computer "S" -: user wins!
        // computer wins 
        if(userMove == 'R' && computerMove == 'S'){
            System.out.println("You win!!!");
        }else if(userMove == 'S' && computerMove == 'R'){
            System.out.println("Computer wins!!!");
        }
        // user "P"
        // computer "S" -: C wins!
        // user wins
        if(userMove == 'P' && computerMove == 'S'){
            System.out.println("Computer wins!!!");
        }else if(userMove == 'S' && computerMove == 'P'){
            System.out.println("You win!!!");
        }  
    }
}
