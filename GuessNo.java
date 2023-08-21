package CodeWithHarry.Playground;
import java.util.Random;
import java.util.Scanner;
class Game
{
    Scanner sc=new Scanner(System.in);
    Random rand=new Random();
    public int number;
    public int inputnumber;
    public int noofGuesses=0;

    public int getNoofGuesses() {
        return noofGuesses;
    }

    public void setNoofGuesses(int noofGuesses) {
        this.noofGuesses = noofGuesses;
    }
    Game() {
        number= rand.nextInt(100);
    }
    void takeUserInput() {
        noofGuesses++;
        System.out.println("Enter your Guessed no");
        inputnumber=sc.nextInt();

    }
    boolean isCorrectNumber(){
        if (inputnumber==number) {
            System.out.printf("You guessed it right,it was %d\nYou guessed it in your %d attempts",number,noofGuesses);
            return true;
        }
        else if(inputnumber<number)
            System.out.println("Too low");
        else
            System.out.println("Too high");
        return false;
    }
}

public class GuessNo {
    public static void main(String[] args){
        /*
            Create a class Game, which allows a user to play "Guess the Number"
            game once. Game should have the following methods:
            1. Constructor to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            4. getter and setter for noOfGuesses
            Use properties such as noOfGuesses(int), etc to get this task done!
         */
        boolean b=false;
        Game g=new Game();
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
