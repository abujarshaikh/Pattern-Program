import java.util.Scanner;

/**
 * pattern1
 * A B C D
 * A B C D
 * A B C D
 * A B C D
 */
public class pattern1 {

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the value for n : ");
          int n = sc.nextInt();
          for (int i = 1; i <= n; i++) {
               for (int j = 1; j <= n; j++) {
                    char c = (char) (j + 64);
                    System.out.print(c + " ");
               }
               System.out.println();
          }
          sc.close();
     }
}