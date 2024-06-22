package conditionals.intermediate;

import java.util.Scanner;

public class FutureInvestment {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the present value of asset");
        int present = sc.nextInt();
        System.out.println("Enter the expected rate at which it grow");
        int rate = sc.nextInt();
        System.out.println("Enter the time in year");
        int year = sc.nextInt();

        double futureValue = present *Math.pow((1+rate), year);
        System.out.printf("the presrnt value of asset is %d after %d year it become %2.2f",present,year,futureValue);

    }
}
