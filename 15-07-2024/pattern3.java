import java.util.Scanner;

public class pattern3 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the value of 'n' : ");
          int n = sc.nextInt();
          for (int i = 1; i < n * 2; i++) {
               for (int j = 1; j < n * 2; j++) {
                    if (j - i < n && j + i > n && i + j < n * 3 && i - j < n) {
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
