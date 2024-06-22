package flowChart;
import java.util.Scanner;
public class Multpolicationtable {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a table to write its table");
        int x=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(x*i);
         }

    }
}
