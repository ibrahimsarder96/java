//Single Inheritance example


class Animal{ 
void pigon()
{
System.out.println("pigon...");
}  
}  
class Bird extends Animal{  
void crow()
{
System.out.println("crow...");
}  
}  
class TestInheritance
{  
public static void main(String args[])
{  
Bird b=new Bird();  
b.pigon(); 
b.crow();
}
}  