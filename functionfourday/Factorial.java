package functionfourday;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int fact= calFact(x);

        System.out.println(fact);
    }

    public static int calFact(int x){
        int res=1;
        for(int i=1;i<=x;i++){
            res*=i;
        }

        return res;
    }
}
