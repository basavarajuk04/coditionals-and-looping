import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number (a): ");
        int a = sc.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number (b): ");
        int b = sc.nextInt();

        // Compare the two numbers and print the result
        if (a > b) {
            System.out.println("a is greater than b");
        } else if (a == b) {
            System.out.println("a is equal to b");
        } else {
            System.out.println("a is less than b");
        }

        // Close the scanner
        sc.close();
    }
}
