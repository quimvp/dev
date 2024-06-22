package firstjava;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number in which you want the fibbonacci series :: ");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Enter the positive number");
        }else{
            System.out.println("Fibonacci series up to " + n + " terms:");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacciIterative(i) + " ");
            }
        }

    }

    public static int fibonacciIterative(int n){
        if(n<=1){
            return n;
        }
        int fib0=0, fib1=1,fibN=1;
        for(int i=2;i<=n;i++){
            fibN = fib0 + fib1;
            fib0 = fib1;
            fib1 = fibN;
        }
        return fibN;
    }
}
