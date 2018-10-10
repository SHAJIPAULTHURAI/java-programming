import java.util.Scanner;
class Prime_Not {
  public static void main(String[] args) {
    int a;
    System.out.println("");
    Scanner s = new Scanner(System.in);
    a = s.nextInt();
        boolean flag = false;
        for(int i = 2; i <= a/2; ++i)
        {
            if(a % i == 0)
            {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
  
