import java.util.Scanner;
class PrintHello {
  public static void main(String[] args) {
    int n;
    System.out.println("Enter n");
            Scanner sc = new Scanner (System.in);
         n=sc.nextInt();
    for (int i = 0; i < n; i++)
      {
    System.out.println("Hello");
      }
   }
}
