package conditionals;

import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base of triangle:");
        int x = sc.nextInt();
        System.out.println("Enter the height of triangle:");
        int y = sc.nextInt();

        float area = (float) ( y * x)/2;

        System.out.printf("The area of triangle with base %d and height %d is: %.3f\n", x, y, area);
    }
}
