package conditionals;

import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        int r = sc.nextInt();
        double area = 3.14 * r * r;
        System.out.printf("  5The area of circle with radius %d is %.2f\n", r, area);
    }
}
