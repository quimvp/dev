package conditionals.intermediate;

import java.util.Scanner;

public class HCFtwonumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the two number to find itsa hcf");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=HCF(x,y);
        System.out.println("The HCF is "+z);
        
    }

    public static int HCF(int x,int y){
        while(y!=0){
            int temp  = y;
            y = x%y;
            x=temp;
        }
        return x;
    }
}
