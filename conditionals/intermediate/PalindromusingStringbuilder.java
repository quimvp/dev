package conditionals.intermediate;

import java.util.Scanner;

public class PalindromusingStringbuilder {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Entedr the number to check its palindrom or not ");
        long d=sc.nextLong();

        String original = Long.toString(d);
        String reversed = new StringBuilder(original).reverse().toString();

        if(reversed.equals(original)){
           System.out.println("Palindrom");
        }else{
            System.out.println("Not");
        }

    }
}
