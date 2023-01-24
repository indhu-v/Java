class college
{
public void display()
{
System.out.println("SSE");
}
}
class department extends college
{
public void display1()
{
System.out.println("CSE");
}
}
class course extends department
{
public void display2()
{
System.out.println("programming in java");
}
}
class college_inheritance
{
public static void main(String[]args)
{
course c=new course();
c.display();
c.display1();
c.display2();
}
}