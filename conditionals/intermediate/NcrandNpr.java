package conditionals.intermediate;

import java.util.Scanner;

public class NcrandNpr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n and r");
        int x=sc.nextInt();
        int y=sc.nextInt();

        long nfact=fact(x);
        long rfact=fact(y);
        long nrfact=fact(x-y);


        float ncr=nfact/(rfact*nrfact);
        float npr = nfact/nrfact;

        System.out.println("the Value of Ncr :"+ncr);
        System.out.println("the Value of Npr :"+npr);
    }

    public static long fact(int num){
        long fact=1;
        for(int i=1;i<=num;i++){
           fact =  fact*i;
        }

        return fact;
    }
}
