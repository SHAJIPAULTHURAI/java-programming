import java.util.Scanner;
class Oddnumbers_twonumbers {
  public static void main(String[] args) {
    int n=1,i=0;
		Scanner X = new Scanner(System.in);
		System.out.print("");
		n = X.nextInt();
		for(i=1; i<n; i++)
		{
				if(i%2!=0)
				System.out.println(i);
		}	
	}
}
