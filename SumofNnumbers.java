import java.util.Scanner;
class SumofNnumbers {
  public static void main(String[] args) {
   int a,i=1;
   int b=0;
   System.out.println("");
   Scanner s = new Scanner(System.in);
   a=s.nextInt();
   while(i<=a)
   {
     b=b+i;
     i++;
  }
  System.out.println(b);
  }
}
