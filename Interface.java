interface Interface
{
static final int Roll = 8734;
static final String Name = "Ibrahim";
void Display();
}
class Result implements Interface
{
public float Mark;
public void Display()
{
System.out.println("Roll is :"+Roll);
System.out.println("Name is :"+Name);
}
public void GetMark()
{
Mark = 65.45f;
}
public void ShowMark()
{
System.out.println("Mark is :"+Mark);
}
}
class interf
{
public static void main(String args[])
{
Result R = new Result();
R.Display();
R.GetMark();
R.ShowMark();
}
}