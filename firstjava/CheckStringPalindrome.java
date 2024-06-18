package firstjava;

import java.util.Scanner;

public class CheckStringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check if it is a palindrome or not:");
        String s = sc.nextLine();
        String t = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            t = t + s.charAt(i);
        }
        if (s.equals(t)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
