import java.util.Scanner;
class Palindrome_Not {
  public static void main(String[] args) {
     int a,b,c = 0,x;
        Scanner s = new Scanner(System.in);
        System.out.print("");
        a = s.nextInt();
        b = a;
        while(a > 0)
        {
            x = a % 10;
            c = c * 10 + x;
            a = a / 10;
        }
        if(c == b)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
