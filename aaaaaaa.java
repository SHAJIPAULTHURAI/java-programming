import java.util.Scanner;
class  {
  public static void main(String[] args) {
    int low,high;
Scanner s = new Scanner(System.in);
low=s.nextInt();
high=s.nextInt();
System.out.println(" ");
    while(low<high)
    {
      boolean flag = false;
      for(int i=2;i<=low/2;i++){
        if(low%i==0){
          flag = true;
          break;
        }
      }
      if (!flag)
    System.out.println(low+" ");
    low++;
    }
  }
}
