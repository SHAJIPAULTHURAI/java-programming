import java.util.*;
import java.lang.*;
import java.io.*;
class Operator
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a=10,b=20;
    int c,d,e,f,g,h,i,j,k,l,m,n,o,p;
    boolean q,r,s;
c=a+b;
d=a-b;
e=a*b;
f=b/a;
g=b%a;
h=b++;
i=b--;
j=a&b;
k=a|b;
l=a^b;
m=~a;
n=a<<2;
o=a>>2;
p=a>>>2;
q=((a>b)&&(b>a));
r=((a>b)||(b>a));
s=(!((a>b)&&(b>a)));
    System.out.println(c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+i+" "+j+" "+k+" "+l+" "+m+" "+n+" "+o+" "+p+" "+q+" "+r+" "+s);
  }
}
