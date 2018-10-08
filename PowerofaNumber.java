import java.util.Scanner;
class PowerofaNumber {

  public static void main(String[] args) {
        int base, exponent;

        long result = 1;
  System.out.println("");
   Scanner s = new Scanner(System.in);
base=s.nextInt();
exponent=s.nextInt();
        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }

        System.out.println(result);
    }
}
