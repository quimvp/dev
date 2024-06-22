package conditionals.intermediate;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args){
        System.out.println("Enter the x-coordinate of the first point:");
        Scanner sc=new Scanner(System.in);
        int x1 = sc.nextInt();
        System.out.println("Enter the y-coordinate of the first point:");
        int y1 = sc.nextInt();

      
        System.out.println("Enter the x-coordinate of the second point:");
        int x2 = sc.nextInt();
        System.out.println("Enter the y-coordinate of the second point:");
        int y2 = sc.nextInt();

        double dist= Math.sqrt(Math.pow(x2- x1,2)+Math.pow(y2-y1,2));
        System.out.printf("The distance between the two points is: %.2f%n", dist);


        // System.out.printf("Distance between two points is :: %.2f "+ dist);

        
        
    } 
}
