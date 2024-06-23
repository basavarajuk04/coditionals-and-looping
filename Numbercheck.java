
import java.util.Scanner;


public class Numbercheck {
    public static void main(String[] args) {
    int number;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    number=sc.nextInt();
        if(number >= 10) {
            System.out.println("The number is greater than 10.");
        }
    }
}
