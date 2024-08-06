import java.util.Scanner;

/**
 * pattern2
 * A A A A
 * B B B B
 * C C C C
 * D D D D
 */
public class pattern2 {

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the value for n : ");
          int n = sc.nextInt();
          for (int i = 1; i <= n; i++) {
               for (int j = 1; j <= n; j++) {
                    char c = (char) (i + 64);
                    System.out.print(c + " ");
               }
               System.out.println();
          }
          sc.close();
     }
}