package conditionals;

import java.util.Scanner;

public class fibbonacciSeries {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int first=0,second=1;
        System.out.print("Fibonacci Series: " + first + ", " + second);
        for(int i=2;i<=x;i++){
            int next=first+second;
            System.out.print(", "+next);
            first=second;
            second=next;
        }
        

    }
}
