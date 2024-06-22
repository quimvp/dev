package functionfourday;

import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(System.in);
        int x=sc.nextInt();
  

        String largest =(x%2==0)?"Even":"odd";
        System.out.println(largest);

    }
}
