import java.util.Scanner;
public class bonus
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the grade of the employee:");
char ch=s.next().charAt(0);
if(ch=='A')
{
System.out.println("enter the employee salary ");
int a=s.nextInt();
if(a<10000)
{
int bonus=a/7;
int total=a+bonus;
System.out.println("bonus="+bonus);
System.out.println("total to be paid="+total);
}
else
{
int bonus=a/5;
int total=a+bonus;
System.out.println("bonus="+bonus);
System.out.println("total to be paid="+total);
}
}
else if(ch=='B')
{
System.out.println("enter the employee salary ");
int b=s.nextInt();
if(b<10000)
{
int bonus=b/12;
int total=b+bonus;
System.out.println("bonus="+bonus);
System.out.println("total to be paid="+total);
}
else
{
int bonus=b/10;
int total=b+bonus;
System.out.println("bonus="+bonus);
System.out.println("total to be paid="+total);
}
}
}
}