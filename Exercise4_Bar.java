import java.util.Scanner;

class Exercise4_Bar{
    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        String Material = "";
        int x = 0;
        
        System.out.println("What would you like your bar to be made out of off? :/");
        Material = Scan.next(); 
        System.out.println("");
        System.out.println("Now, how long this bar be?????????????????");
        x = Scan.nextInt();
        System.out.println("");
        
        for (int i = 0; i <= x; i++){
            System.out.print(Material + "");
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("There you go :)");
    }
}