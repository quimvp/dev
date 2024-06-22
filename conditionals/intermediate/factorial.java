package conditionals.intermediate;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to calculate its factorial");
        int x=sc.nextInt();
        int a=1;
       
        for(int i=1;i<=x;i++){
         a *=i;
        }

        System.out.println(a);
    }
}
