import java.util.Scanner;

public class pattern5 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter th evalues for n : ");
          int n = sc.nextInt();
          for (int i = 1; i <= n; i++) {
               for (int j = 1; j <= n; j++) {
                    System.out.print(j + " ");
               }
               System.out.println();
          }
          sc.close();
     }
}
