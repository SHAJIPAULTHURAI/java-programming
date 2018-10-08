import java.util.Scanner;
class SumofNnumbers {
  public static void main(String[] args) {
   int a,i=1;
   int b=0;
   Scanner s = new Scanner(System.in);
   a=s.nextInt();
   System.out.println(a);
   while(i<=a)
   {
     b=b+i;
     i++;
  }
  System.out.println(b);
  }
}
