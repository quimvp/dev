package firstjava;

import java.util.Scanner;

public class TwoNumberLargest {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the two number to companre");
        System.out.println("Enter first number");
        int x= sc.nextInt();
        System.out.println("Enter second  number");
        int y= sc.nextInt();

        if(x==y){
            System.out.println("Equal");
        }else if(x>y){
            System.out.println("X is greater");
        }else{
            System.out.println("Y is greater");
        }
    }
}
