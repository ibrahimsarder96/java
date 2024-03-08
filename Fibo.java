//Firs 10 fibonacci number java program using for statement 


public class fibo
{
public static void main(String args[])
{
int F0=0,F1=1,F;
System.out.println("First 10 Fibonacci Numbers are:");
for(int i=1;i<=10;i++)
{
F=F0+F1;
System.out.print(" "+i+" ");
F1=F0;
F0=F;
}
}
}
