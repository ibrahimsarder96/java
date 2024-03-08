class Student
{
int Roll;
String Name=new String();
}
class Result extends Student	//Inheriting Student class
{
float Mark;
void GetData()
{
Roll=135023;
Name="Ibrahim";
Mark=86.65f;
}
Void Display()
{
System.out.println("Roll is:"+Roll);
System.out.println("Name is:"+Name);
System.out.println("Mark is:"+Mark);
}
}
class inherit
{
public static void main(String args[])
{
Result R=new Result();
R.GetData();
R.Display();
}
}
