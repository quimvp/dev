package conditionals.intermediate;

import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the original price:");
            int originalPrice = sc.nextInt();

            if (originalPrice <= 0) {
                throw new IllegalArgumentException("Original price must be greater than 0.");
            }

            System.out.println("Enter the commission you received:");
            float commissionReceived = sc.nextFloat();

            if (commissionReceived <= 0 || commissionReceived > originalPrice) {
                throw new IllegalArgumentException("Commission received must be greater than 0 and less than or equal to the original price.");
            }

            // Calculate the commission percentage
            float commissionPercentage = (commissionReceived / originalPrice) * 100;

            // Print the commission percentage
            System.out.printf("The percentage you get as commission is: %.2f%%%n", commissionPercentage);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred. Please ensure you enter valid numbers.");
        } finally {
            sc.close();
        }
    }
}
