class SuperClass
{
int n;
SuperClass()
{
n++;
}
public void GetData()
{
System.out.println("It is SuperClass");
System.out.println("n="+n);
}
}
class SubClass extends SuperClass
{
int n;
SubClass()
{
n++;
}
public void GetData()
{
System.out.println("It is SubClass");
System.out.print("n="+n);
}
}
class over
{
public static void main(String args[])
{
SuperClass sp=new SubClass();
sp.GetData();
SubClass sb=new SubClass();
sb.GetData();
}
}