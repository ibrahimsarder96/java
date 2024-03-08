import java.io.*;		//For statement
public class Nseris
{
public static void main(String args[])
{
int i,n,sum=0;
String s;
try
{
BufferedReader BR=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Valu of N(>=2):");
s=BR.readLine();
n=Integer.parseInt(s);
System.out.println("N 2+4+6.......+N");
System.out.println("..................");
for(i=2;i<=n;i++)
{
sum=sum+i;
System.out.println("+i+\t\t"+sum);
}
}
catch(Exception E){}
}
}
