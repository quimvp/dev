package conditionals.intermediate;

import java.util.Scanner;

public class Average {
    public static void man(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ente the three number");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        // double average = ((double) x + (double) y + (double) z) / 3;
        double average=(x+y+z)/3.0;
        System.out.println("the Average of three number is "+average);
    }
}
