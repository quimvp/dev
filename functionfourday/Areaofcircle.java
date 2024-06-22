package functionfourday;

import java.util.Scanner;

public class Areaofcircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle ");
        double x=sc.nextDouble();

        double area = 3.13 * Math.pow(x,2);

        System.out.println("area is"+area);

        float circumference = (float) (2* 3.14 *x);
        System.out.println("circumference is "+circumference);
    
    }
}
