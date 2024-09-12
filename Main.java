import java.util.Scanner;
import java.util.Random;
public class Main{
    public static void main(String[] args){ 
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int x = rand.nextInt(100);
        int guess;
        guess = scan.nextInt();
        int numberofguesses = 0;

        while(guess!=x){
            if(guess < x){
                System.out.println("too low :( guess again)");
                numberofguesses++;
                guess = scan.nextInt();
            }
            else if (guess > x){
                System.out.println("too high");
                numberofguesses++;
                guess = scan.nextInt();
            }
        }
        
        if(7 > numberofguesses){
            System.out.println("You got an impossibly good score!");
        }
        else if(10 > numberofguesses){
            System.out.println("You did a good job. The correct the number was: " + rand + "it took you " + numberofguesses + " guesses.");
        }
        else{
            System.out.println("Try the divide and conquer strategy next time! The correct the number was: " + rand + "it took you " + numberofguesses + " guesses.");
        }
    }
}