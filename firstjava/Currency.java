package firstjava;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args){
        System.out.println("Enter the Rs in INR :: ");
        Scanner sc = new Scanner(System.in);
        int rs = sc.nextInt();

        float dollar = rs / 80.00000f;
        System.out.printf("The %d INR is equal to %.2f USD.%n", rs, dollar);
    }
}
