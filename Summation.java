//break && continue uses java program

import java.io.*;
public class Summation
{
public static void main(String args[])throws IOException
{
int x,y,z;
String s1,s2;
loop1:
for(;;)
{
BufferedReader  BR=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter two number");
s1=BR.readLine();
s2=BR.readLine();
x=Integer.parseInt(s1);
y=Integer.parseInt(s2);
if(x<=0||y<=0)
{
System.out.print("Wrong Input(Enter Again)");
continue loop1;
}
else
{
z=x+y;
System.out.println("The Summation is:="+z);
break loop1;
}
}
}
}