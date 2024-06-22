package conditionals.intermediate;

import java.util.Scanner;

public class DiscountProduct {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ente the Product price :: ");
        System.out.println("Enter the Product price: ");
        float price = sc.nextFloat(); 
        System.out.println("Enter the discount percentage: ");
        float discount = sc.nextFloat(); 
        System.out.println("Product price: " + price);
        System.out.println("Discount percentage: " + discount);

        float finalprice =price - (price * discount)/100;

        System.out.println("final discounted price is :  "+finalprice);


      
    }
}
