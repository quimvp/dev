package functionfourday;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Largestofthree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three number to calculate largest");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();



        
        // if(x>y && x>z){
        //      System.out.println(x);
        // }
        // else if(y>x && y>z){
        //     System.out.println(y);
        // }else{
        //     System.out.println(z);
        // }



      //  using array
    //   int [] laregst = {x,y,z};
    //   Arrays.sort(laregst);
    //   System.out.println("Largest number is "+laregst[2]);



    //using math.max
    // int laregst = Math.max(x, Math.max(y,z));
    // System.out.println(laregst);
    

    //using ternary
    // int laregst = (x>y)?((x>z)?x:z):((y>z)?y:z);


    //using stream
    int laregst = IntStream.of(x,y,z).max().getAsInt();

    }
}
