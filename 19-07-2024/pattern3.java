import java.util.Scanner;
// A B C D 
// E F G H 
// I J K L 
// M N O P 

public class pattern3 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the value for n : ");
          int n = sc.nextInt();
          int count = 1;
          for (int i = 1; i <= n; i++) {
               for (int j = 1; j <= n; j++) {
                    char c = (char) (count + 64);
                    System.out.print(c + " ");
                    count++;
               }
               System.out.println();
          }
          sc.close();
     }
}
