import java.util.Scanner;

/**
 * pattern1
 */
public class pattern1 {

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter Number of rows : ");
          int n = sc.nextInt();
          for (int i = 1; i <= n; i++) {
               for (int j = 1; j <= (n + 1) / 2; j++) {
                    if (i + j <= n + 1 && i >= j) {
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