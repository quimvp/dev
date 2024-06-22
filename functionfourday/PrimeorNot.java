package functionfourday;

import java.util.Scanner;

public class PrimeorNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enters the numcber to check it is prime or not ");
        int x =sc.nextInt();
        boolean check = ispirme(x);

        String s =check?"number is prime":"no tprime";

        System.out.println("number is "+s);

    }

    public static boolean ispirme(int x){
        int i=2;
        while(i<x)
        {
           if(x%i==0){
            return false;
           }
           i++;
        }

    
        return true;
    }
  /// check prime for consise root
    public static boolean isPrime(int x) {
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
