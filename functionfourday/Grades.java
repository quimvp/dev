package functionfourday;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks = sc.nextInt();
        String check = checkGrades(marks);

        System.out.println("your grade is "+check);
    }

  
        public static String checkGrades(int marks) {
            switch (marks / 10) {
                case 10:
                case 9:
                    return "AA";
                case 8:
                    return "AB";
                case 7:
                    return "BB";
                case 6:
                    return "BC";
                case 5:
                    return "CD";
                case 4:
                    return "DD";
                default:
                    return "Fail";
            }
        
    }
}
