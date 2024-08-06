import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of times to print the pattern: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(j);
                if (j < 3) {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
