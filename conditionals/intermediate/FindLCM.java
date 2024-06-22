package conditionals.intermediate;

import java.util.Scanner;

public class FindLCM {

    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the two number to find itsa LCM");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=LCM(x,y);
        System.out.println("The LCM is "+z);
        
    }

    public static int LCM(int x,int y){
        while(y!=0){
            int temp  = y;
            y = x%y;
            x=temp;
        }
        return x;
    }
}


