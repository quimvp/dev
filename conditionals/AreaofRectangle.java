package conditionals;

import java.util.Scanner;

public class AreaofRectangle{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base and Height of rectangle");
        System.out.println("Enter the height of recatgnle");
    
        int x=sc.nextInt();

        System.out.println("Enter the breadth of recatgnle");
    
        int y=sc.nextInt();

        double area=x*y;

        System.out.printf("The area of the rectangle is %.2f\n", area);


    }
}