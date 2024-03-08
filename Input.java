import java.io.*;
public class Input
{
public static void main(String args[]) throws IOException
{
int roll[]=new int[5];
String s[]=new String[5];
for(int i=0;i<5;i++)
{
System.out.println("\n Enter Roll["+i+"]");
BufferedReader BR=new BufferedReader(new InputStreamReader(System.in));
s[i]=BR.readLine();
roll[i]=Integer.parseInt(s[i]);
}
for(int i=0;i<5;i++)
{
System.out.println("\n Roll["+i+"]="+roll[i]);
}
}
}