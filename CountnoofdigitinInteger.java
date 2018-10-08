import java.util.Scanner;
class CountnoofdigitinInteger {
 public static void main(String[] args) {
   int count=0,a;
   System.out.println("");
   Scanner s = new Scanner(System.in);
   a=s.nextInt();
   while(a!=0)
   {
     a/=10;
     ++count;
   }
  System.out.println(count);
  }
}
