import java.io.*;
public class Switch
{
public static void main(String args[])
{
int year=0;
String s;
try
{
InputStreamReader IN=new InputStreamReader(System.in);
BufferedReader BR=new BufferedReader(IN);
System.out.print("Enter Your Academic Year(From 1 to 4):");
s=BR.readLine();
year=Integer.parseInt(s);
switch(year)
{
case 1:
System.out.println("You are a student of first year");
break;
case 2:
System.out.println("You are a student of second year");
break;
case 3:
System.out.println("You are a student of Third year");
break;
case 4:
System.out.println("You are a student of Fourth year");
break;
default:
System.out.println("Wrong  Input");
}
}
catch(Exception e){}
}
}