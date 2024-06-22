package conditionals.intermediate;

import java.util.Scanner;

public class VowelandConsonent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch =sc.next().charAt(0);

        boolean check=isVowel(ch);

        if (check) {
            System.out.println("IsVowel");
        }
        else{
            System.out.println("is nodt vowel");
        }
    }

    public static boolean isVowel(char c){
      c= Character.toLowerCase(c);

      return c=='a' || c=='e' || c=='i' ||c=='o' ||c=='u';
    }
}
