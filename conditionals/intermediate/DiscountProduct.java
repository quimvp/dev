package conditionals.intermediate;

import java.util.Scanner;

public class DiscountProduct {
    public static void man(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ente the Product price :: ");
        System.out.println("Enter the Product price: ");
        float price = sc.nextFloat(); 
        System.out.println("Enter the discount: ");
        float discount = sc.nextFloat(); 
        System.out.println("Product price: " + price);
        System.out.println("Discount: " + discount);
      
    }
}
