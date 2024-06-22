package conditionals;

import java.util.Scanner;

public class PrintLargestofall {
      public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int largest=Integer.MIN_VALUE;
        while(true){
            int n=sc.nextInt();
            if(n==0){
                System.out.println(("Loop exited because you enter zero"));
                break;
            }
            if(n>largest){
                largest=n;
            }
            
        }
        System.out.println("the largest is "+largest);
    }
}
