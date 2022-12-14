import java.util.Scanner;
class username_valid
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the user name:");
String str1=s.nextLine();
System.out.println("reenter the user name:");
String str2=s.nextLine();
if(str1.equals(str2))
{
System.out.println("uers name is valid");
}
else
{
System.out.println("user nsme is invalid");
}
}
}