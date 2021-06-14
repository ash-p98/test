import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner user_input = new Scanner(System.in);

        int wallWidth;
        System.out.print("Enter width of wall (mm): ");
        wallWidth = user_input.nextInt();

        int wallHeight;
        System.out.print("Enter height of wall (mm): ");
        wallHeight = user_input.nextInt();

        double paintNeeded = (wallHeight * wallWidth)/1000000 ;
        System.out.println("The amount of paint needed is: " + paintNeeded + "L");
    }
}
