import java.util.Scanner;

public class pattern5 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the value for n : ");
          int n = sc.nextInt();

          for (int i = 1; i <= n; i++) {
               for (int j = 1; j <= n; j++) {
                    if (j == n || (j - i <= n - 1) && (j >= i)) {
                         char c = (char) (j + 96);
                         System.out.print(c + " ");
                    } else {
                         System.out.print("  ");
                    }
               }
               System.out.println();
          }
          sc.close();
     }
}
