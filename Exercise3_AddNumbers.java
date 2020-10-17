import java.util.Scanner;
import java.text.DecimalFormat;

class Exercise3_AddNumbers{
    public static void main(String[] args){
        boolean NegativeNumber = false;
        double Sum = 0;
        double Input = 0;
        double PreviousNumberSum = 0;
        Scanner Scan = new Scanner(System.in); 
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println("");
        System.out.println("Hello! Welcome to the best online calculator in the world.");
        System.out.println("But you CANNOT type in a negative number :)");
        System.out.println("Otherwise the calculation will stop");
        System.out.println("By Ethan Xie");
        System.out.println("");
        
        if (!NegativeNumber){
            while(Input >= 0){
                System.out.print("Add: ");
                Input = Scan.nextDouble(); 
                if (Input < 0){
                    NegativeNumber = true;
                }
                else{ 
                    Sum = Input + PreviousNumberSum;
                    //System.out.println("Input: " + Input);
                    //System.out.println("PreviousNumber: " + PreviousNumber);
                    //System.out.println("Sum: " + Sum);
                    PreviousNumberSum = Sum;
                    //System.out.println("Input: " + Input);
                    //System.out.println("PreviousNumber: " + PreviousNumber);
                    //System.out.println("Sum: " + Sum);
                }
            }
        }
        if (NegativeNumber){   
            System.out.println("");
            if (Sum == 0){
                System.out.println("Maybe try starting with a positive number? O_o");
            }
            else {
                System.out.println("The sum of all the positive numbers is " + df.format(Sum));
                System.out.println("Rounds up to 2 decimal, gotta be profressional :0");
            }
        }
    }
}