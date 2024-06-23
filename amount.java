import java.util.Scanner;

public class amount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your initial account balance: ");
        int balance = scanner.nextInt();

        while (balance >= 2000) {
            balance -= 2000;
            System.out.println("2000 withdrawn. Current balance:" + balance);
        }

        System.out.println("Insufficient funds. Your balance is " + balance);
        scanner.close();
    }
}
