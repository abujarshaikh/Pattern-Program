
//             *
//           * * *
//         * * * * *
//       * * * * * * *       
//     * * * * * * * * *     
//   * * * * * * * * * * *   
// * * * * * * * * * * * * * 
import java.util.*;

public class pattern4 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter values for rows/column: ");
          int n = sc.nextInt();
          for (int i = 1; i <= n; i++) {
               for (int j = 1; j < (n * 2); j++) {
                    if (i + j >= n + 1 && j - i <= n - 1) {
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
