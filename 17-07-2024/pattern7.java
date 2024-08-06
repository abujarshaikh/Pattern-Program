import java.util.Scanner;

public class pattern7 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter th evalues for n : ");
          int n = sc.nextInt();
          int count = 1;
          for (int i = 1; i <= n; i++) {
               for (int j = 1; j <= n; j++) {

                    if (count == n + 2) {
                         count = 1;
                    }
                    System.out.print(count + " ");
                    count++;

               }
               System.out.println();
          }
          sc.close();
     }
}
