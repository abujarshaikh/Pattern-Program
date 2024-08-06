import java.util.Scanner;

// A E I M 
// B F J N 
// C G K O 
// D H L P 
public class pattern4 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the value of n : ");
          int n = sc.nextInt();
          for (int i = 1; i <= n; i++) {
               for (int j = 0; j < n; j++) {
                    char c = (char) ((i + 64) + (j * n));
                    System.out.print(c + " ");
               }
               System.out.println();
          }
          sc.close();
     }
}
