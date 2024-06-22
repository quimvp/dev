package firstjava;
import java.util.Scanner;

public class TwoNumberOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int x = sc.nextInt();
        System.out.println("Enter the second number:");
        int y = sc.nextInt();

        System.out.println("Enter the operator (+, -, X, /):");
        String s = sc.next();

        if (s.equals("+")) {
            System.out.println(x + y);
        } else if (s.equals("-")) {
            System.out.println(x - y);
        } else if (s.equalsIgnoreCase("X")) {
            System.out.println(x * y);
        } else if (s.equals("/")) {
            if (y != 0) {
                System.out.println(x / y);
            } else {
                System.out.println("Cannot divide by zero");
            }
        } else {
            System.out.println("Enter a valid operator");
        }

        sc.close();
    }
}
