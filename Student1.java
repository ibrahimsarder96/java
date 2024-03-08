interface Student1
{
static final int Roll=135023;		//static final member
static final String Name="Abir";	//static final member
void Disply();				//Interface method decleared
}
class Result implements Student1
{
public float Mark;
public void Display()			//Interface method defined
{
System.out.println("Roll is:"+Roll);
System.out.println("Name is:"+Name);
}
public void GetMark()			//own method defined 
{
Mark=88.44f;
}
public void ShowMark()			//own method defined
{
System.out.println("Mark is:"+Mark);
}
}
class interf
{
public static void main(String args[])
{
Result R=new Result();
R.Display();
R.GetMark();
R.ShowMark();
}
}
