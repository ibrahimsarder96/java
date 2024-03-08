class A extends Thread		//Thread A
{
public void run()
{
for(int i=1; i<=5;i=i+2)
{
System.out.println("Inside Thread A: i="+i);
}
System.out.println("Exit from A");
}
}
class B extends Thread		//Thread B
{
public void run()
{
for(int j=1; j<=5;j=j+2)
{
System.out.println("Inside Thread B: j="+j);
}
System.out.println("Exit from B");
}
}
class MainThread		//Main Thread
{
public static void main(String args[])
{
A Th1=new A();
B Th2=new B();
System.out.println("Starting Thread A");
Th1.start();
System.out.println("Starting Thread B");
Th2.start();
System.out.println("Exit from Main Thread");
}
}