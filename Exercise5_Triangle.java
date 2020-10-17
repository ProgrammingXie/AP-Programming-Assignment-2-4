import java.util.Scanner;

class Exercise5_Triangle{
    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        String Material = "";
        int x = 0;
        
        System.out.println("WELCOME to the land where you can creat your own right triangle!");
        System.out.println("By Ethan Xie");
        System.out.println("");
        System.out.println("What character will your triangle be made out off?");
        Material = Scan.next();
        System.out.println("");
        System.out.println("Now, how tall will your triangle be?");
        x = Scan.nextInt();
        System.out.println("");
        for (int i = 0; i < x; i++){
            for(int w = 0; w <= i; w++){
                System.out.print(Material + " ");
            }
            System.out.println("");
        }
    }
}
