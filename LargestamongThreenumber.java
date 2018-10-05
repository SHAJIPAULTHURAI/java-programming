import java.util.Scanner;
Class LargestamongThreenumber{
public static void main(String[] arg){
int a,b,c;
System.out.println("Enter three numbers");
Scanner in=new Scanner(System.in);
a=in.nextInt();
b=in.nextInt();
c=in.nextInt();
if(a > b && a > c)
System.out.println(a);
else if(b > a && b>c)
System.out.println(b);
else
System.out.println(c);
}
}

