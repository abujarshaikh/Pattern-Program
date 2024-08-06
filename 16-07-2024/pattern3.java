// *
// * *
// *   *
// *     *       
// *       *     
// *         *   
// *           * 
// *         *   
// *       *     
// *     *       
// *   *
// * *
// *
import java.util.Scanner;

public class pattern3 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the value for n : ");
          int n = sc.nextInt();
          for (int i = 1; i < n * 2; i++) {
               for (int j = 1; j <= n; j++) {
                    if (j == 1 || i == j || i + j == n * 2) {
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
