import java.io.*;
public class elseif
{
public static void main(String args[])
{
int age=0;
String s;
try
{
InputStreamReader in =new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(in);
System.out.println("Enter Your age");
s=br.readLine();
age=Integer.parseInt(s);
if(age<=0)
System.out.println("you have not borned yet !");
else if(age>0 && age<=12)
System.out.println("You are a child");
else if(age>12 && age<=19)
System.out.println("You are a teen ager");
else if(age>19 && age<=40)
System.out.println("You are Young");
else if(age>40)
System.out.println("Wish your long life");
}
catch(Exception E){}
}
}
