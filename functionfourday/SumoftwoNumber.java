package functionfourday;

import java.util.Scanner;

public class SumoftwoNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two number");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int sum = add(x,y);
        System.out.println(sum);

        int prod= product(x, y);
        System.out.println(prod);
    }

    public static int add(int x,int y){
        return x+y;
    }

    public static int product(int x,int y){
        return x*y;
    }


}
