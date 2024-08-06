
// *                       * 
// * *                   * * 
// * * *               * * * 
// * * * *           * * * * 
// * * * * *       * * * * * 
// * * * * * *   * * * * * * 
// * * * * * * * * * * * * *
import java.util.Scanner;

/**
 * pattern1
 */
public class pattern1 {

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter values for rows/column: ");
          int n = sc.nextInt();
          for (int i = 1; i <= n; i++) {
               for (int j = 1; j < n * 2; j++) {
                    if (i >= j || i + j >= n * 2) {
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
