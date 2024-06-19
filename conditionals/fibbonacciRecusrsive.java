package conditionals;

import java.util.Scanner;

public class fibbonacciRecusrsive {
    public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.print("Fibonacci Series: ");

        for(int i=0;i<=x;i++){
            System.out.print(fibonacci(i) + ", ");
        }
    }

    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }

        return fibonacci(n-1)+fibonacci(n-2);
    }
}
