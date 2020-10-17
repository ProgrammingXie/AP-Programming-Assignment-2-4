
import java.util.Scanner;

class Exercise6_D6{
    public static void main(String[] arg){
        Scanner Scan = new Scanner(System.in);
        int RollTime = 0;
        int RollNumber = 0;
        int Total = 0;
        String Continue = "Y";

        while (Continue.equals("Y")){
            RollTime = 0;
            RollNumber = 0;
            Total = 0;
            
            System.out.println("How many D6's do you good sir want to roll?");
            RollTime = Scan.nextInt();
            System.out.print("You have rolled: ");        
            for (int i = 0; i < RollTime; i++){
                RollNumber = (int) (Math.random()*6) + 1;
                Total = Total + RollNumber;
                System.out.print(RollNumber + " ");
            }
            
            System.out.println("");
            System.out.println("Total: " + Total);
            System.out.println("");
            System.out.print("Would you like to roll again, sir? [Y/N] ");
            Continue = Scan.next();
            System.out.println("");
        }   
        System.out.println("Thank you for time, have a good day.");  
    }
}
