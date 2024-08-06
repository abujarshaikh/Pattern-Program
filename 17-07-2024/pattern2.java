//write a java program to print pascal traingle pattern.

import java.util.Scanner;

public class pattern2 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter value for n : ");
          int n = sc.nextInt();
          for (int i = 1; i <= n; i++) {
               for (int j = 1; j < n * 2; j++) {
                    if ((i + j) % 2 == 0 && (i + j) > n && j - i < n) {
                         System.out.print("* ");
                    } else if ((i + j) % 2 != 0 && (i + j) > n && j - i < n) {
                         System.out.print(". ");
                    } else {
                         System.out.print("  ");
                    }
               }
               System.out.println();
          }
          sc.close();
     }
}
