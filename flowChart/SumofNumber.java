package flowChart;
import java.util.Scanner;
public class SumofNumber {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number :");
        int x= sc.nextInt();
        System.out.println("Enter the Second number");
        int y=sc.nextInt();

        int z=sum(x,y);

        System.out.println(z);
    }


    public static int sum(int x,int y){
        return x+y;
    } 
}
