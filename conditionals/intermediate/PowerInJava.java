package conditionals.intermediate;

import java.util.Scanner;

public class PowerInJava {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        try{
              
            System.out.println("Enter the number to calculates its power : ");
            int x=sc.nextInt();

            if(x<0){
            throw new IllegalArgumentException("Enter the valid number not negative-");
            }

            double poer = Math.pow(x, 2);
            //int power =  (int) Math.pow(x,2) --------------- by defyualt power return float
            System.out.println(poer);


        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println("An error occurred. Please ensure you enter valid numbers.");
        }finally{
            System.out.println("Ffinally executed");
            sc.close();
        }

    }
}
