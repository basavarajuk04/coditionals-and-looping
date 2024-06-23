public class odd {

    public static void main(String[] args) {
        System.out.println("Even numbers from 1 to 100:");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
