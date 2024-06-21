package conditionals;

import java.util.Scanner;

public interface Sumofnumber {
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        
        int x=sc.nextInt();
        int y=sc.nextInt();
        int sum=x+y;
        System.out.println("The sum fo number is "+sum);

    }
}
