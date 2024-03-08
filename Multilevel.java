//Multilevel inherittance

class Multilevel
{
int Roll;
String Name=new String();
void GetData()
{
Roll = 135023;
Name ="Ibrahim";
}
void Display()
{
System.out.println("Inside Student Class");
System.out.println("Roll is:"+Roll);
System.out.println("Name is :"+Name);
}
}
class Exam extends Multilevel
{
float Mark;
void GetData()
{
Mark = 80.55f;
}
void Display()
{
System.out.println("Inside Exam Class");
System.out.println("Mark is :"+Mark);
}
}
class Result extends Exam
{
Multilevel M= new Multilevel();
Exam E = new Exam();
void GetData()
{
M.GetData();
E.GetData();
}
void Display()
{
M.Display();
M.Display();
}
}
class Student
{
public static void main(String args[])
{
Result R = new Result();
R.GetData();
R.Display();
}
}