package flowChart;
import java.util.Scanner;
public class sumCalculator {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.println("Enter a number (or 'x' to stop):");
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("x")){
                break;
            }

            try {
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'x' to stop.");
            }

        }
        System.out.println("The sum of all entered numbers is: " + sum);
        sc.close();
    }
}
