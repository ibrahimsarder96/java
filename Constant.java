class Student
{
int Roll;
string Name;
float Mark;
public Student();	//class object Constructor and Method
{
Roll=135060;
Name="Musfiqur";
Mark=85.75f;
System.out.println("Roll:"+Roll);
System.out.println("Name:"+Name);
System.out.println("Mark:"+Mark);
}
}
public class Cons
{
public static void main(String args[])
{
Student s=new Student();
}
}
