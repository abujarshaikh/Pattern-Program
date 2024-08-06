// * * * * * * * 
//   * * * * * * *   
//     * * * * * * *     
//       * * * * * * *       
//         * * * * * * *
//           * * * * * * *
//             * * * * * * *

import java.util.Scanner;

public class pattern2 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter value of 'n' : ");
          int n = sc.nextInt();

          for (int i = 1; i <= n; i++) {
               for (int j = 1; j < n * 2; j++) {
                    if (i <= j && j - i <= n - 1) {
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
