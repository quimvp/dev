package flowChart;
import java.util.Scanner;
public class LcmAndHCF {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number :");
        int x= sc.nextInt();
        System.out.println("Enter the Second number");
        int y=sc.nextInt();

        int hcf=findHCF(x,y);
        int lcm=findLCM(x,y,hcf);

        System.out.println("hcf"+hcf);
        System.out.println("lcm"+lcm);

    }

    public static int findHCF(int x,int y){
        while(y!=0){
            int temp=y;
            y=x%y;
            x=temp;
        }
      return x;
    }

    public static int findLCM(int x,int y,int hcf){
        return (x * y) / hcf;
    }
}
