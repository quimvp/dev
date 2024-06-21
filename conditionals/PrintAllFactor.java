   package conditionals;

import java.util.Scanner;

public class PrintAllFactor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int x=sc.nextInt();
        int i=1;
        while(i<=x){
            if(x%i==0){
                System.out.println(i);
              
            }
            i++;
        }
    }
}
