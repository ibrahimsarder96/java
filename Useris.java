import java.io.*;
public class Useris
{
public static void main(String args[])
{
int i,n,sum=0;
String s;
try
{
BufferedReader BR=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter valu of N(>=1):");
s=BR.readLine();
n=Integer.parseInt(s);
System.out.println("N 1+2+3+4.....+N");
System.out.println("...................");
for(i=1;i<=n;i++)
{
sum=sum+i;
System.out.println("+i+\t\t"+sum);
}
}
catch(Exception E){}
}
}