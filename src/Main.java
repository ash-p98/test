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

        int paintNeeded = (wallHeight * wallWidth)/1000000 ;
        System.out.println("The amount of paint needed is: " + paintNeeded + "L");

        int amount10 = paintNeeded / 10;
        paintNeeded = paintNeeded % 10;

        int amount5 = paintNeeded / 5;
        paintNeeded = paintNeeded % 5;

        int amount2 = (int) (paintNeeded / 2.5);
        paintNeeded = (int) (paintNeeded % 2.5);

        System.out.println("amount of 10L tins " + amount10);
        System.out.println("amount of 5L tins " + amount5);
        System.out.println("amount of 2.5L tins " + amount2);

    }
}
