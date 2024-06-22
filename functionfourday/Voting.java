package functionfourday;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        String vote = (age>=18)?"able to vote":"smaller" ;

        System.out.println(vote);
    }
}
