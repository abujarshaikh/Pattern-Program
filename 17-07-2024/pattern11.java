public class pattern11 {
     public static void main(String[] args) {
          int n = 5;
          for (int i = 1; i <= n; i++) {
               for (int j = 1; j <= n; j++) {
                    if (j == 1 || j == n) {
                         System.out.print("1 ");
                    } else if (j % 2 == 0) {
                         System.out.print("* ");
                    } else {
                         System.out.print("0 ");
                    }
               }
               System.out.println();
          }
     }
}
