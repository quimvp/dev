package conditionals.intermediate;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        System.out.println("Enter the String");
        Scanner sc=new Scanner(System.in);

        String st = sc.next();
        String rev="";

        // for(int i=st.length()-1;i>=0;i--){
        //     rev+=st.charAt(i);
        // }


        int x=st.length();
        int i=0;

        //-------------- this method is not applied to the string becaus ein javaccript string is immutable we ave to use string builder for that
        // while(i<=st.length()/2){
        //     char c=st.charAt(i);
        //     st.charAt(i)=st.charAt(x-1);
        //     st.charAt(x-1)=c;
        //     x--;
        //     i++;
        // }

        StringBuilder ans=new StringBuilder(st);
        while(i<st.length()/2){
            char c=st.charAt(i);
            char temp=st.charAt(x-1);

            ans.setCharAt(i, temp);
            ans.setCharAt(x-1, c);
            i++;
            x--;
        }


        System.out.println("reverses string is  :  "+ans);
    }
}
