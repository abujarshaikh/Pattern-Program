import java.util.Scanner;

/**
 * pattern1
 */
public class pattern1 {

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the value for n : ");
          int n = sc.nextInt();
          for (int i = 1; i < n * 2; i++) {
               for (int j = 1; j < n * 2; j++) {
                    if ((i == n)
                              || (j == n)
                              || (i + j <= n + 1 && i == 1)
                              || (i + j >= n + 1 && j == 1)
                              || (i + j < n * 3 && j == n * 2 - 1)
                              || (i - j <= n - 1 && i == n * 2 - 1)) {
                         System.out.print("* ");
                    } else {
                         System.out.print("  ");
                    }
               }
               System.out.println();
          }
          sc.close();
     }
}