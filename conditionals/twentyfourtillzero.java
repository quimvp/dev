package conditionals;

import java.util.Scanner;

public class twentyfourtillzero {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int sum=0;
        while(true){
            int n=sc.nextInt();
            if(n==0){
                System.out.println(("Loop exited because you enter zero"));
                break;
            }
            sum=+n;
            
        }
        System.out.println("the sum is "+sum);
    }
}
