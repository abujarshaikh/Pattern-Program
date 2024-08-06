// // 2,6,22,278,65814

import java.util.Scanner;

/**
 * number1
 */
public class number1 {

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          long n = sc.nextLong();
          long num = 2;
          long power = 4;
          for (long i = 0; i < n; i++) {
               System.out.print(num + ",");
               num += power;
               power *= power;
          }
          sc.close();
     }
}