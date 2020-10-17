import java.util.Scanner;

class Exercise7_GuessingGame{
    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        int RandomNumber = (int) (Math.random() * 100) +1;
        int YourGuess = 1;
        int Tries = 0;
        
        System.out.println("Computer: I have picked a random number between 1 or 100.");
        System.out.println("What is your best guess? ");
        
        while(YourGuess != RandomNumber){
            YourGuess = Scan.nextInt();
            if (YourGuess > RandomNumber){
                System.out.println("No, your guess is too high. :]");
            }
            else if (YourGuess < RandomNumber){
                System.out.println("That's too low. :]");
            }   
            Tries++;
        }
        
        System.out.println("");
        System.out.println("Good Job! You finally got it, looks like it took you " + Tries + " tries.");
        
        
        
    }
}
