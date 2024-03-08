import java.util.Scanner;
class LargestValu
{
int a,b,c;
void process()
{
Scanner Sc=new Scanner(System.in);
System.out.println("Enter the valu of Thread Number");
a=Sc.nextInt();
b=Sc.nextInt();
c=Sc.nextInt();
if(a>b)
{
if(a>c)
System.out.println("Larges valu is:"+a);
}
else
{
System.out.println("Largest valu is:"+c);
}
else if(b>c);
{
System.out.println("Largest valu is:"+b);
}
else
{
System.out.println("Largest valu is:"+c);
}
}
}
class Result
{
public static void main(String args[])
{
LargestValu obj=new LargestValu();
obj.process();
}
}