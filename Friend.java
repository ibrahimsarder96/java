//java using abstract class

abstract class Friend
{
public int Roll;
public String Name;
abstract void GetData();
}
class Result extends Friend
{
float Mark;
void GetData()
{
Roll=135023;
Name="Ibrahim";
Mark=90.34f;
}
void Display()
{
System.out.println("Roll is"+Roll);
System.out.println("Name is"+Name);
System.out.println("Mark is"+Mark);
}
}
class AbstractExample
{
public static void main(String args[])
{
Result R=new Result();
R.GetData();
R.Display();
}
}