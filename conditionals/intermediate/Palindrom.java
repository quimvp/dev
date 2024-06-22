package conditionals.intermediate;

import java.util.Scanner;

public class Palindrom {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number to check is it palindro or not ");

        long original =  sc.nextLong();
        long num=original;
        long c=0;

        while(num!=0){
            long d=num%10;
            c=c*10+d;
           num=num/10;
        }

        if(c==original){
            System.out.println("Equal");
        }else{
            System.out.println("not Equal");
        }

    }
}
