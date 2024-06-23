public class nestedfor {

    public static void main(String[] args) {
        // Outer loop for rows
        for (int i = 1; i <= 5; i++) {
            // Inner loop for columns
            for (int j = 1; j <= 5; j++) {
                // Print the product of i and j
                System.out.print(i * j + "\t");
            }
            // Print a new line after each row
            System.out.println();
        }
    }
}
