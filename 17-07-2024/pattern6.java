import java.util.Scanner;

public class pattern6 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter th evalues for n : ");
          int n = sc.nextInt();
          int count = 1;
          for (int i = 1; i <= n; i++) {
               for (int j = 1; j <= n; j++) {
                    System.out.print(count + " ");
                    count++;
               }
               System.out.println();
          }
          sc.close();
     }
}
