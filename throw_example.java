public class throw_example
{
public static void validate(int age)
{
if(age<18)
{
throw new ArithmeticException("person is not eligible to vote");
}
else
{
System.out.println("person is not eligible to vote!!");
}
}
public static void main(String[]args)
{
validate(9);
System.out.println("throw example");
}
}